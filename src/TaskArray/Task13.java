package TaskArray;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                int a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
