package TaskArray;

import java.util.Arrays;

public class Task25 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int c = 1, i = 0;

        do {
            int j = 0;
            do {
                arr[i][j] = c;
                c++;
                j++;
            }
            while (j < 5);
            i++;
        }
        while (i < 5);

        i = 0;
        do {
            System.out.println(Arrays.toString(arr[i]));
            i++;
        }
        while (i < 5);
    }
}
