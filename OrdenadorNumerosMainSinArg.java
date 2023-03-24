import java.util.Arrays;

public class OrdenadorNumerosMainSinArg {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Debe proporcionar tres números y una letra como parámetros.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        String orden = args[3];

        int[] nums = ordenarNumeros(num1, num2, num3, orden);

        System.out.println("Números ordenados: " + Arrays.toString(nums));
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
