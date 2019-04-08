package TaskArray;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < 5; i++) {
            int a = arr[i];
            arr[i] = arr[i + 5];
            arr[i + 5] = a;
        };
        System.out.println(Arrays.toString(arr));
    }
}
