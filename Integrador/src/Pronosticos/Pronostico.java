package Pronosticos;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Pronostico {

    int puntajeP= 0;
	Partido partidoP = new Partido();
	Equipo equipoP = new Equipo("","");
	Enum resultadoP;
    ArrayList<Partido> pronosticos = new ArrayList<>();
    public Pronostico() {
    }

    public ArrayList<Partido> cargaP(String archivo) {
        
        String localP, visitanteP;
        File file = new File(archivo);

        try(Scanner fileS = new Scanner(file, StandardCharsets.UTF_8)){
            while(fileS.hasNextLine()){
                String[] vector = (fileS.nextLine()).split(";");
                localP = vector[0];
                visitanteP = vector[4];
                if (vector[2] != ""){
                    resultadoP = ResultadoEnum.EMPATE;
                }else if (vector[1] != ""){
                    resultadoP = ResultadoEnum.VICTORIA;
                }else if (vector[3] != ""){
                    resultadoP = ResultadoEnum.DERROTA;
                }

                Equipo localC = new Equipo(localP,localP);
                Equipo visitanteC = new Equipo(visitanteP,visitanteP);

                Partido pronostico = new Partido();
                pronostico.equipoLocal = localC;
                pronostico.equipoVisitante = visitanteC;
                pronostico.resultado = resultadoP;
                pronosticos.add(pronostico);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return pronosticos;
    
    }
    public Equipo getEquipoP() {
        return equipoP;
    }
    public void setEquipoP(Equipo equipoP) {
        this.equipoP = equipoP;
    }
    public int puntajeP(boolean acierto) {
        if (acierto==true){
            puntajeP++;
        }
        return puntajeP;
    }
	
}
