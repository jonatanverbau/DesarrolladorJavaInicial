package clase6.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.*;

import clase6.src.Calculadora;
public class testCalculadora {
  Calculadora c;
  @Before
  public void iniciarObjetoCalc(){
  c= new Calculadora();
  }
  @Test
  public void test1() {
    assertEquals(240,c.multiplicar(80,3),0);
  }

  @Test
  public void test2() {
    assertEquals(110,c.dividir(c.sumar(150,180),3),0);
  }

  @Test
  public void test3() {
    assertNotEquals(605,c.multiplicar(c.restar(90,50),15),0);
  }

  @Test
  public void test4() {
    assertNotEquals(2700,c.multiplicar(c.sumar(70,40),25),0);
  }
}