package clase7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compra {
    public static void main(String[] args) {

            if (args.length < 3) {
                System.err.println("Debe especificar el tipo, valor y tope del descuento");
                return;
            }
            String tipoDescuento = args[0];
            float valorDescuento = Float.parseFloat(args[1]);
            float topeDescuento = Float.parseFloat(args[2]);
        
            Descuento descuento;
            if (tipoDescuento.equals("fijo")) {
                descuento = new DescFijo();
            } else if (tipoDescuento.equals("porcentaje")) {
                descuento = new DescPorc();
            } else if (tipoDescuento.equals("porcentajeConTope")) {
                descuento = new DescPorcConTope();
            } else {
                System.err.println("Tipo de descuento no válido");
                return;
            }
            descuento.setValorDesc(valorDescuento);
            if (descuento instanceof DescPorcConTope) {
                ((DescPorcConTope) descuento).setTope(topeDescuento);
            }
        Carrito carrito = new Carrito();

        String archivo = "clase7/productos.csv" ;
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
System.out.println(item.getProducto().getNombre() + " - Cantidad: " + item.getCantidad() + " - Precio total: " + item.getPrecio());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }
        double total = descuento.valorFinal(carrito.getTotal());
        System.out.println("Descuento aplicado es "+tipoDescuento+" con el valor de: "+valorDescuento);
        System.out.println("El precio total de la compra es: " + total);
    }
}

