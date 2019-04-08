package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task34 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][5];
        int x = Integer.MIN_VALUE, y = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int j = 4;
        for (int i = 0; i < 5; i++) {
            if (arr[i][i]>x)
                x=arr[i][i];
            if (arr[i][j]>y)
                y=arr[i][j];
            j--;
        }
        System.out.println("Max element diagonali sleva na pravo - "+x);
        System.out.println("Max element diagonali sprava na levo - "+y);
    }
}
