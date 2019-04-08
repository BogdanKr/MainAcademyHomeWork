package TaskArray;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i < 11; i++) {
            arr[i - 1] = i;
        }
        int a;
        a = arr[0];
        arr[0] = arr[9];
        arr[9] = a;
        System.out.println(Arrays.toString(arr));
    }
}
