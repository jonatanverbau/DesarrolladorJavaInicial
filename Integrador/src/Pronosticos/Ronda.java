package Pronosticos;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ronda {
    int nro;
    ArrayList<Partido> partidos = new ArrayList<>();

    public Ronda(int n) {
        this.nro = n;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void agregarPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public ArrayList<Partido> getPartidos(String archivo) {

        String local, visitante;
        int golesLocal,golesVisitante;
        File file = new File(archivo);

        try (Scanner fileS = new Scanner(file, StandardCharsets.UTF_8)){

            while (fileS.hasNextLine()){
                String[] vector = (fileS.nextLine().split(";"));
                local = vector[0];
                visitante = vector[3];
                golesLocal = Integer.parseInt(vector[1]);
                golesVisitante = Integer.parseInt(vector[2]);
                
                Equipo localC = new Equipo (local, local);
                Equipo visitanteC = new Equipo (visitante, visitante);

                Partido partidoR = new Partido();
                partidoR.equipoLocal = localC;
                partidoR.equipoVisitante = visitanteC;
                partidoR.golesLocal = golesLocal;
                partidoR.golesVisitante = golesVisitante;

                partidos.add(partidoR);
            }
        } catch (IOException e) {
			e.printStackTrace();

		}
        return partidos;
    }
}