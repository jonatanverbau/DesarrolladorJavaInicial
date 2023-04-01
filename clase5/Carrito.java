package clase5;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
        private List<ItemCarrito> items = new ArrayList<>();
    
        public void agregarItem(Producto producto, int cantidad) {
            ItemCarrito item = new ItemCarrito(producto, cantidad);
            items.add(item);
        }
    
        public List<ItemCarrito> getItems() {
            return items;
        }
    
        public double getTotal() {
            double total = 0;
            for (ItemCarrito item : items) {
                total += item.getPrecio();
            }
            return total;
        }

        public void agregarProducto(Producto producto1, int i) {
        }

        public void agregarItem(ItemCarrito item) {
            items.add(item);
        }
    }