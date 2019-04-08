package OOP.Task13;

public class MyIntArray {
    private int[] array;

    public MyIntArray(int a) {
        array = new int[a];
    }

    public void size() {
        System.out.println(array.length);
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
    }
}
