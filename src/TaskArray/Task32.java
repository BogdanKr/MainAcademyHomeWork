package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task32 {
    public static void main(String[] args) {
        ArrSumMaxStroki();
    }

    private static void ArrSumMaxStroki() {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int[] sum = new int[5];
        int a = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(100);
                sum[i] += arr[i][j];
            }
            if (i != 0 && sum[i] > sum[i - 1])
                a = i;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Stroka s max summoi nomer " + (a + 1));
        System.out.println(Arrays.toString(arr[a]));
        System.out.println("Summa dannih stroki =" + sum[a]);

    }
}
