package TaskArray;

import java.util.Arrays;

public class Task26 {
    public static void main(String[] args) {
        ArrDouble(5, 5);
    }

    public static int[][] ArrDouble(int x, int y) {
        int[][] arr = new int[x][y];
        int c = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = c;
                c++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }
}
