package TaskArray;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int i = 0;
        do {
            int a = arr[i];
            arr[i] = arr[i + 5];
            arr[i + 5] = a;
            i++;
        }
        while (i < 5);
        System.out.println(Arrays.toString(arr));
    }
}
