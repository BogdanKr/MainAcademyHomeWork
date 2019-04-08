package TaskArray;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 30, j = 0;
        do {
            arr[j] = i;
            i--;
            j++;
        }
        while (i > 20);
        System.out.println(Arrays.toString(arr));
    }
}
