package TaskArray;

import java.util.Arrays;

import static TaskArray.Task26.ArrDouble;

public class Task29 {
    public static void main(String[] args) {
        int[][] arr = ArrDouble(5, 5);
        ArrTurn(arr);
    }

    private static void ArrTurn(int[][] arr) {
        int[][] arr2 = new int[5][5];
        System.out.println();
        int x = 0;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                arr2[x][j] = arr[i][j];
            }
            x++;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}
