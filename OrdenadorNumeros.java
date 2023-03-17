
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Jonatan
 */
public class OrdenadorNumeros {

    // Ordena los números dados en un vector de 3 en el orden especificado
public int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
    int[] nums = {num1, num2, num3};
    int temp;
    boolean ascendente = orden.toLowerCase().equals("ascendente");

    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            boolean debeIntercambiar = (ascendente && nums[i] > nums[j]) || (!ascendente && nums[i] < nums[j]);
            if (debeIntercambiar) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    return nums;
}

public static void main(String[] args) {
    OrdenadorNumeros ordenador = new OrdenadorNumeros();
    int[] numerosAsc = ordenador.ordenarNumeros(3, 1, 2, "ascendente");
    int[] numerosDesc = ordenador.ordenarNumeros(5, 4, 6, "decreciente");

    System.out.println("Numeros ordenados en orden ascendente: " + Arrays.toString(numerosAsc));
    System.out.println("Numeros ordenados en orden descendente: " + Arrays.toString(numerosDesc));
}
}