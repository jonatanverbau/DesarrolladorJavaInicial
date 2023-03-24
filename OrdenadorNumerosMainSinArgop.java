import java.util.Arrays;
import java.util.Scanner;

public class OrdenadorNumerosMainSinArgop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1 = 0, num2 = 0, num3 = 0;
            String orden = "";
            boolean num1Set = false, num2Set = false, num3Set = false;
    
            // Check for command line arguments
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                if (arg instanceof String) {
                    String str = (String) arg;
                    if (str.equals("a") || str.equals("d")) {
                        orden = str;
                    }
                } else if (arg instanceof Integer) {
                    Integer[] num = (Integer[]) arg;
                     
                        num1 = num[i];
                        num1Set = true;
                    if (i == 1) {
                        num2 = num[i];
                        num2Set = true;
                    } else if (i == 2) {
                        num3 = num[i];
                        num3Set = true;
                    }
                }
            }
    
            // Prompt the user for any missing arguments
            if (!num1Set) {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextInt();
            }
            if (!num2Set) {
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextInt();
            }
            if (!num3Set) {
                System.out.print("Ingrese el tercer número: ");
                num3 = scanner.nextInt();
            }
            if (orden.equals("")) {
                System.out.print("Ingrese la letra de ordenamiento (a/d): ");
                orden = scanner.next();
            }
    
            scanner.close();
    
            int[] nums = ordenarNumeros(num1, num2, num3, orden);
    
            System.out.println("Números ordenados: " + Arrays.toString(nums));
        }
    }

    public static int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
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