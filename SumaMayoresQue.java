/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class SumaMayoresQue {
  
  public static int sumaMayoresQue(int[] numberos, int x) {
    int sum = 0;
    for (int numeros : numberos) {
      if (numeros > x) {
        sum += numeros;
      }
    }
    return sum;
  }
  


  
  public static void main(String[] args) {
    int[] numeros = { 3, 5, 2, 8, 1, 7 };
    int x = 4;
    int sum = SumaMayoresQue.sumaMayoresQue(numeros, x);
    System.out.println("La suma de los números mayores que " + x + " es " + sum);
  }
}