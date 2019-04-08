package TaskArray;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 1;
        while (i < 11) {
            arr[i - 1] = i;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
