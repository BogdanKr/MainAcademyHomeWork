package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task28b {
    public static void main(String[] args) {
        ArrMax();

    }

    private static void ArrMax() {
        int[][] arr = new int[5][5];
        Random random = new Random();
        int c = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(100);
                if (arr[i][j] > c)
                    c = arr[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Max element is - " + c);
    }
}
