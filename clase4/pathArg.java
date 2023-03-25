package clase4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class pathArg {
    public static void main(String[] args) {
        String rutaArch = args[0];
        int suma= 0;
        try {
            for (String linea : Files.readAllLines(Paths.get(rutaArch))){
                suma += Integer.parseInt(linea);
            }
            System.out.println("La suma de los números del archivo es: "+suma);
        } catch (NumberFormatException | IOException e) {

            e.printStackTrace();
        }
    }
}
