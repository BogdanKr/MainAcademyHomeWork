package TaskArray;

public class Task20 {
    public static void main(String[] args) {
        int[] arr = new int[]{54, 22, 38, 45, 59, 6, 78, 99, 79, 10};
        int a = 0, i = 0;
        while (i < 10) {
            a = a + arr[i];
            i++;
        }
        System.out.println("Summ - " + a);
    }
}
