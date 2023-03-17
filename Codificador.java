import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class Codificador {

    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz ";

    public static String codificar(String texto, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            int indice = ABECEDARIO.indexOf(caracter);
            if (indice != -1) {
                int indiceCodificado = (indice + desplazamiento) % ABECEDARIO.length();
                resultado.append(ABECEDARIO.charAt(indiceCodificado));
            } else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }

    public static String decodificar(String textoCodificado, int desplazamiento) {
        return codificar(textoCodificado, ABECEDARIO.length() - desplazamiento);
    }



    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena: ");
            String cadena = scanner.nextLine();

            System.out.print("Ingrese un numero de desplazamiento: ");
            int desplazamiento = scanner.nextInt();

            String cadenaCodificada = Codificador.codificar(cadena, desplazamiento);
            String cadenaDecodificada = Codificador.decodificar(cadenaCodificada, desplazamiento);

            System.out.println("Cadena codificada: " + cadenaCodificada);
            System.out.println("Cadena decodificada: " + cadenaDecodificada);
        }
    }
}