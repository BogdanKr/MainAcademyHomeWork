package TaskArray;

public class Task18 {
    public static void main(String[] args) {
        int[] arr = new int[]{54, 22, 38, 45, 59, -3, 78, 199, 79, 10};
        int a = Integer.MIN_VALUE;
        int i = 0;
        do {
            if (arr[i] > a)
                a = arr[i];
            i++;
        }
        while (i < 10);
        System.out.println("Maximum - " + a);
    }
}
