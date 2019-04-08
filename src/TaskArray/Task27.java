package TaskArray;

import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {
        ArrDouble2();
    }

    private static void ArrDouble2() {
        int[][] arr = new int[5][5];
        int c = 25;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = c;
                c--;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
