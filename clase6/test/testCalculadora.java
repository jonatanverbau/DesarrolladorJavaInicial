package clase6.test;
import org.junit.Test;
public class testCalculadora {

  public double sumar(double unNumero, double otroNumero) {
    return unNumero + otroNumero;
  }

  public double restar(double unNumero, double otroNumero) {
    return unNumero - otroNumero;
  }

  public double multiplicar(double unNumero, double otroNumero) {
    return unNumero * otroNumero;
  }

  public double dividir(double unNumero, double otroNumero) {
    if (otroNumero == 0) {
      throw new IllegalArgumentException("No se puede dividir por cero");
    }
    return unNumero / otroNumero;
  }
}