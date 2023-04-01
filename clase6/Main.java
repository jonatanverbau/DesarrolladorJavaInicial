package clase6;
public class Main{
public static void main(String[] args) {
  
  Calculadora calculadora = new Calculadora();
  
  double resultado1 = calculadora.multiplicar(80, 3);
  double resultado2 = calculadora.dividir(calculadora.sumar(150, 180),3);
  double resultado3 = calculadora.multiplicar(calculadora.restar(90, 50),15);
  double resultado4 = calculadora.multiplicar(calculadora.sumar(70, 40), 25);
  
  System.out.println("1: " + resultado1);
  System.out.println("2: " + resultado2);
  System.out.println("3: " + resultado3);
  System.out.println("4: " + resultado4);
}
}