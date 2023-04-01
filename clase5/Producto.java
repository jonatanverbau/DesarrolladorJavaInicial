package clase5;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(int cantidad, double precio, String nombre) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}