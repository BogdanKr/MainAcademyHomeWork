package TaskArray;

import java.util.Arrays;
import java.util.Random;

public class Task22 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int x = 0;
        do {
            x=0;
            for (int i = 0; i < 9; i++) {
                if (arr[i] > arr[i + 1]) {
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                    x = 1;
                }
            }
        }
        while (x != 0);
        System.out.println(Arrays.toString(arr));

    }
}
