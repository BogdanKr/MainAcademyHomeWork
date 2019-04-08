package TaskArray;

import java.util.Arrays;

public class Task24 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int c = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = c;
                c++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
