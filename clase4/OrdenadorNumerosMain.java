package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenadorNumerosMain {

    // Ordena los números dados en un vector de 3 en el orden especificado
    public int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
        int[] nums = { num1, num2, num3 };
        int t;
        switch (orden) {
            case "a":
                for (int i = 0; i < nums.length; i++) {
                    t = nums[i];
                    int j = i;
                    while (j > 0 && t < nums[j - 1]) {
                        nums[j] = nums[j - 1];
                        j--;
                    }
                    nums[j] = t;
                }
            case "d":
                for (int i = 0; i < nums.length; i++) {
                    t = nums[i];
                    int j = i;
                    while (j > 0 && t > nums[j - 1]) {
                        nums[j] = nums[j - 1];
                        j--;
                    }
                    nums[j] = t;
                }
                break;
            default:

                // Default secuencia de sentencias.
        }

        return nums;
    }

    public static void main(String[] args) {
        OrdenadorNumerosMain ordenador = new OrdenadorNumerosMain();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese 3 números enteros:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            System.out.print("Ingrese un orden ascendente (a) o descendente (d): ");
            String orden = scanner.next();
            int[] ordenados = ordenador.ordenarNumeros(num1, num2, num3, orden);
            System.out.println("Numeros ordenados: " + Arrays.toString(ordenados));
        }
    }
}