package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task23 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int a;
        for (int i = 1; i < 10; i++) {
            a = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > a) {
                arr[j + 1] = arr[j];
                arr[j] = a;
                j -= 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
