package clase4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class pathArgOp {
    public static void main(String[] args) {
        String rutaArch = args[0];
        String operacion = args[1];
        int resultado= 0;
        try {
            for (String linea : Files.readAllLines(Paths.get(rutaArch))){
                int numero =Integer.parseInt(linea);
                if (operacion.equals("suma")){
                resultado += numero;} else if 
                (operacion.equals("multiplicacion")){
                    if (resultado == 0){
                        resultado = numero;
                    }
                    resultado *= numero;}
            }
            System.out.println("La "+operacion+" de los números del archivo es: "+resultado);
        } catch (NumberFormatException | IOException e) {

            e.printStackTrace();
        }
    }
}
