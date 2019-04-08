package TaskArray;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int j = 0;
        for (int i = 30; i > 20; i--) {
            arr[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
