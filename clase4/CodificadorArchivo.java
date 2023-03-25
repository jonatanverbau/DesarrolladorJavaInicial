package clase4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author Jonatan
 */
public class CodificadorArchivo {

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
        if (args.length < 4) {
            System.out.println("Debe especificar la acción (codificar o decodificar), el desplazamiento, la ruta del archivo de entrada y la ruta del archivo de salida.");
            System.exit(1);
        }
    
        String accion = args[0];
        int desplazamiento = Integer.parseInt(args[1]);
        String archivoEntrada = args[2];
        String archivoSalida = args[3];
    
        String contenido = "";
        try {
            // Lee el archivo de entrada y lo guarda en la variable 'contenido'
            contenido = new String(Files.readAllBytes(Paths.get(archivoEntrada)));
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de entrada: " + e.getMessage());
            System.exit(1);
        }
    
        String resultado = "";
        if (accion.equalsIgnoreCase("codificar")) {
            resultado = codificar(contenido, desplazamiento);
        } else if (accion.equalsIgnoreCase("decodificar")) {
            resultado = decodificar(contenido, desplazamiento);
        } else {
            System.out.println("La acción especificada no es válida. Debe ser 'codificar' o 'decodificar'.");
            System.exit(1);
        }
    
        try {
            // Guarda el resultado en el archivo de salida
            Files.write(Paths.get(archivoSalida), resultado.getBytes());
            System.out.println("La operación se ha completado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de salida: " + e.getMessage());
            System.exit(1);
        }
}}