package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        ArrSum();
    }

    private static void ArrSum() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int[] sum = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[j][i] = random.nextInt(100);
                sum[i] += arr[j][i];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Summa stolbca " + (i + 1) + " = " + sum[i]);

        }
    }
}
