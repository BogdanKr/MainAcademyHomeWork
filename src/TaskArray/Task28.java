package TaskArray;

import java.util.Arrays;

import static TaskArray.Task26.ArrDouble;

public class Task28 {
    public static void main(String[] args) {
        int[][] arr = ArrDouble(6, 6);
        int[][] arr1 = new int[6][3];
        int[][] arr2 = new int[6][3];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = arr[i][j];
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        for (int i = 0; i < 6; i++) {
            int k=0;
            for (int j = 3; j < 6; j++) {
                arr2[i][k] = arr[i][j];
                k++;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}
