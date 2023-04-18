package TrabajoIntegrador.src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        args = new String[] {"ronda.txt","pronosticos.txt"};
        if (args.length != 2) {
            System.err.println("Debe proporcionar la ruta del archivo de la ronda de partidos como argumento.");
            System.exit(1);
        }
        
        // Leer el archivo de la ronda de partidos
        List<Partido> partidos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                Equipo equipoLocal = new Equipo(tokens[0], "");
                Equipo equipoVisitante = new Equipo(tokens[1], "");
                int golesLocal = Integer.parseInt(tokens[2]);
                int golesVisitante = Integer.parseInt(tokens[3]);
                partidos.add(new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de la ronda de partidos: " + e.getMessage());
            System.exit(1);
        }

        // Leer los pronósticos del participante
        List<ResultadoEnum> pronosticos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[1]))) {
            String line;
            for (int i = 0; i < partidos.size(); i++) {
                line = br.readLine();
                if (line == null) {
                    System.err.println("El archivo de los pronósticos no contiene suficientes líneas.");
                    System.exit(1);
                }
                ResultadoEnum resultado = ResultadoEnum.valueOf(line.toUpperCase());
                pronosticos.add(resultado);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de los pronósticos: " + e.getMessage());
            System.exit(1);
        }

        // Calcular el puntaje del participante
        int puntaje = 0;
        for (int i = 0; i < partidos.size(); i++) {
            Partido partido = partidos.get(i);
            ResultadoEnum resultadoReal = partido.getResultado(null);
            ResultadoEnum resultadoPronosticado = pronosticos.get(i);
            if (resultadoReal == resultadoPronosticado) {
                puntaje++;
            } else if (resultadoReal == ResultadoEnum.EMPATE && resultadoPronosticado == ResultadoEnum.EMPATE) {
                puntaje++;
            }
        }

        // Imprimir el puntaje del participante
        System.out.println("El puntaje del participante es: " + puntaje);
    }
}