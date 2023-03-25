package clase4;

import java.util.Scanner;

public class OrdenadorNumerosMainSinArgop {
    public static void main(String[] args) {
        int[] nums = new int[3];
        String order = "";
        
        if(args.length < 4) {
            try (Scanner scanner = new Scanner(System.in)) {
                for(int i=0; i<args.length; i++) {
                    nums[i] = Integer.parseInt(args[i]);
                }
                
                for(int i=args.length; i<3; i++) {
                    System.out.println("Ingrese el número " + (i+1) + ": ");
                    nums[i] = scanner.nextInt();
                }
                
                System.out.println("Ingrese el orden (a o d): ");
                order = scanner.next();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        else {
            nums[0] = Integer.parseInt(args[0]);
            nums[1] = Integer.parseInt(args[1]);
            nums[2] = Integer.parseInt(args[2]);
            order = args[3];
        }
        
        // Llamada al método de ordenamiento
        int[] ordenados = ordenarNumeros(nums, order);
        
        // Imprime los números ordenados
        System.out.println("Números ordenados:");
        for(int i=0; i<3; i++) {
            System.out.println(ordenados[i]);
        }
    }

    public static int[] ordenarNumeros(int[] nums, String orden) {

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
            break;
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
        }
        return nums;
    }
}