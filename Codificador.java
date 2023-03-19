import java.util.Scanner;
/**
 *
 * @author Jonatan
 */
public class Codificador {

    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz";

    public static String codificar(String texto, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();
        //convierte texto a minusculas
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            //con indexOf ubicamos la posición de la variable caracter dentro de la constante abecedario
            int indice = ABECEDARIO.indexOf(caracter);
            //en el caso de que caracter se encuentre en la cadena hace esto:
            if (indice != -1) {
                //al indice del caracter le sumamos el desplazamiento y con el módulo % lo que hacemos es ajustar el índice al rango de nuestro abecedario para que quede dentro del rango.
                int indiceCodificado = (indice + desplazamiento) % ABECEDARIO.length();
                //con append agregamos al resultado el caracter codificado, es decir con el desplazamiento aplicado
                resultado.append(ABECEDARIO.charAt(indiceCodificado));
            } else {
                //esto es lo que se puede mejorar, si ingreso cualquier caracter que no esté en ABECEDARIO mantiene el mismo dentro de la cadena, se podría aplicar una validación pero no se pide en la consigna.
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
            System.out.print("Ingrese una palabra u oración: ");
            String cadena = scanner.nextLine();

            System.out.print("Ingrese un numero (entero positivo) de desplazamiento para aplicar la codificación: ");
            int desplazamiento = scanner.nextInt();

            String cadenaCodificada = Codificador.codificar(cadena, desplazamiento);
            String cadenaDecodificada = Codificador.decodificar(cadenaCodificada, desplazamiento);

            System.out.println("Cadena codificada: " + cadenaCodificada.replace(" ", ""));
            System.out.println("Cadena decodificada: " + cadenaDecodificada);
        }
    }
}