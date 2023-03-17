/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class contarLetras {
public static int contarLetra(String texto, char letra) {
        char[] caracteres = new char[texto.length()];
        int contador = 0;
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = texto.charAt(i);
            if (caracteres[i] == letra) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String args[]) {
        String texto = "ejercicio de la clase 3";
        char letra = 'a';
        int veces = contarLetra(texto, letra);
        System.out.println("La letra " + letra + " aparece " + veces + " veces en el texto '" + texto + "'");
    }
}
