package clase7.test;

import org.junit.*;
import clase7.Carrito;
import clase7.Producto;
import static org.junit.Assert.assertEquals;
public class testCarrito {
    Carrito c;
    @Before
    public void incializar(){
        c = new Carrito();
    }
    @Test
    public void testGetTotal() {
        // Agregamos un item con un producto de precio 10 y cantidad 2
        Producto producto1 = new Producto(5,10, "Producto 1");
        c.agregarItem(producto1, 2);

        // Agregamos otro item con un producto de precio 5 y cantidad 3
        Producto producto2 = new Producto(4,5, "Producto 2");
        c.agregarItem(producto2, 3);

        // Verificamos que el total sea 35 (10 * 2 + 5 * 3)
        assertEquals(35, c.getTotal(),0);
    }
}