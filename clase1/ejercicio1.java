package clase1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class ejercicio1 {

    public static void main(String args[]) {
        float ingresos = 489082;
        int baseMovilesMenor5anios = 2;
        int baseInmuebles = 2;
        boolean embarcacion = false;
        boolean aeronave = false;
        boolean societario = false;
        boolean cep = (embarcacion || aeronave || societario);
        /**
         * ******************************************
         */
        if ((ingresos < 489083)
                && (baseInmuebles <3)
                && (baseMovilesMenor5anios <3)
                && (!cep)) {
            System.out.println("No pertenece al segmento de ingresos altos");
        } else {
            System.out.println("Pertenece al segmento de ingresos altos");
        }

    }
}
