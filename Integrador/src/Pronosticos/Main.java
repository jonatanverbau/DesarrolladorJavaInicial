package Pronosticos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    
        Ronda ronda = new Ronda(1);
        String archRonda = "C:\\DesarrolladorJava\\DesarrolladorJavaInicial\\Integrador\\src\\Pronosticos\\archivos\\ronda.csv";
        ArrayList<Partido> partidos = ronda.getPartidos(archRonda);
        
        Pronostico pronosticos = new Pronostico ();
        String archPronostico = "C:\\DesarrolladorJava\\DesarrolladorJavaInicial\\Integrador\\src\\Pronosticos\\archivos\\pronosticos.csv";
        ArrayList<Partido> pronosticos_usuario = pronosticos.cargaP(archPronostico);
        
        int puntaje = 0;
        
        System.out.println("Resultados Ronda " + ronda.nro + ": ");
        
        for (int i=0; i< partidos.size(); i++) {
            System.out.println("\n" + partidos.get(i).getEquipoLocal() +  " " + partidos.get(i).getGolesLocal() + " - " + partidos.get(i).getEquipoVisitante() + " " + partidos.get(i).getGolesVisitante());
            System.out.println("El usuario pronosticó que " + pronosticos_usuario.get(i).equipoLocal.nombre + " obtendría " + pronosticos_usuario.get(i).resultado);
            System.out.println("El resultado fue " + partidos.get(i).resultado(pronosticos_usuario.get(i).equipoLocal));
            
            boolean acierto = pronosticos_usuario.get(i).resultado == partidos.get(i).resultado(pronosticos_usuario.get(i).equipoLocal);
            
            puntaje = pronosticos.puntajeP(acierto);
        }
        
        System.out.println("\n*******************");
        System.out.println("Puntaje total: " + puntaje);
    }
}