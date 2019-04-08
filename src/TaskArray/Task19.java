package TaskArray;

public class Task19 {
    public static void main(String[] args) {
        int[] arr = new int[]{54, 22, 38, 45, 59, 6, 78, 99, 79, 10};
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a = a + arr[i];
        }
        System.out.println("Summ - " + a);
    }
}
