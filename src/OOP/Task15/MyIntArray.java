package OOP.Task15;

public class MyIntArray {
    private int[] array;

    public MyIntArray(int a) {
        array = new int[a];
    }

    public int size() {
        return array.length;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1)
                System.out.print(array[i] + ", ");
            else System.out.println((array[i]));
        }
    }

    public void addToTail(int b) {
        int[] array1 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array1[array.length] = b;
        array = array1;
    }

    public void addToHead(int c) {
        int[] array1 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array1[i + 1] = array[i];
        }
        array1[0] = c;
        array = array1;
    }
}
