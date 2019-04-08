package TaskArray;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a, i = 0;
        while (i < 10) {
            a = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = a;
            i = i + 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
