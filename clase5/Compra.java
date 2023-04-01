package clase5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compra {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        String archivo = "clase5/productos.csv" ;
        String separador = ","; // Puede ser "," o "\t"

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean encabezados = true;
            while ((linea = br.readLine()) != null) {
                if (encabezados) { // si es la primera línea, saltarla
                    encabezados = false;
                    continue;
                }
                String[] datos = linea.split(separador);
                String nombre = datos[2];
                double precio = Double.parseDouble(datos[1]);
                int cantidad = Integer.parseInt(datos[0]);
        
                Producto producto = new Producto(cantidad, precio, nombre);
ItemCarrito item = new ItemCarrito(producto, cantidad);

carrito.agregarItem(item);
System.out.println(item.getProducto().getNombre() + " - " + item.getCantidad() + " - " + item.getPrecio());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }
        double total = carrito.getTotal();
        System.out.println("El precio total de los productos es: " + total);
    }
}

