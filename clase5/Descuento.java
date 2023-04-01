package clase5;

public abstract class Descuento {
    public abstract double calcularDescuento(Carrito carrito);
    public class DescuentoPorcentaje extends Descuento {
        private double porcentaje;
    
        public DescuentoPorcentaje(double porcentaje) {
            this.porcentaje = porcentaje;
        }
    
        public double calcularDescuento(Carrito carrito) {
            return carrito.getTotal() * porcentaje / 100;
        }
    }
    
    public class DescuentoMontoFijo extends Descuento {
        private double monto;
    
        public DescuentoMontoFijo(double monto) {
            this.monto = monto;
        }
    
        public double calcularDescuento(Carrito carrito) {
            return Math.min(carrito.getTotal(), monto);
        }
    }
}