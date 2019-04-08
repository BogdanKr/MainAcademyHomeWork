package TaskArray;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i < 11; i++) {
            arr[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
