package clase5;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto2, int cantidad2) {
        this.producto = producto2;
        this.cantidad = cantidad2;
    }

    public ItemCarrito(String string, String string2) {
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return producto.getPrecio() * cantidad;
    }

    public boolean tieneSuficienteCantidad() {
        return false;
    }
}
