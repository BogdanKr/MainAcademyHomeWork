package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task36 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[3][3];
        int a = Integer.MAX_VALUE;
        int b = 0;
        float c;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = random.nextInt(50);
                if (arr[i][j] < a)
                    a = arr[i][j];
                if (arr[i][j] % 2 == 0)
                    b += arr[i][j];
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        c = a / b;
        System.out.println("Proizvedenie min na summu chetnih = " + c);
    }
}
