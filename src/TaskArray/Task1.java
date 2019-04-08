package TaskArray;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int a;
        a=arr[0];
        arr[0]=arr[3];
        arr[3]=a;
        a=arr[2];
        arr[2]=arr[4];
        arr[4]=a;
        System.out.println(Arrays.toString(arr));
    }
}
