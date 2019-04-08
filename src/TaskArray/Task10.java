package TaskArray;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int i = 0;
        while (i < arr.length / 2) {
            int a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
