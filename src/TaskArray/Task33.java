package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task33 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = random.nextInt(20);
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        //начинаю поиск пар
        int x = 0;
        while (x < 3) {
            int y=0;
            while (y < 3) {
                for (int i = x; i < 3; i++) {
                    for (int j = y; j < 3; j++) {
                        if ((arr[x][y] + arr[i][j]) % 2 == 0)
                            if (x != i || y != j)
                            System.out.println("Para kratna 2 - " + arr[x][y] + " i " + arr[i][j]);
                    }
                }
                y++;
            }
            x++;
        }
    }
}
