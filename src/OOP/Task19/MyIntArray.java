package OOP.Task19;

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
            else System.out.println(array[i]);
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

    public int get(int d) {
        if (d >= 0 && d < array.length)
            return array[d];
        else throw new RuntimeException("  Индекс за границами массива");
    }

    public void insertAfter(int a, int b) {
        if (a >= 0 && a < array.length) {
            int[] array1 = new int[array.length + 1];
            for (int i = 0; i <= a; i++) {
                array1[i] = array[i];
            }
            array1[a + 1] = b;
            for (int i = a + 2; i < array1.length; i++) {
                array1[i] = array[i - 1];
            }
            array = array1;
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public void insertBefore(int a, int b) {
        if (a >= 0 && a < array.length) {
            int[] array1 = new int[array.length + 1];
            for (int i = 0; i < a; i++) {
                array1[i] = array[i];
            }
            array1[a] = b;
            for (int i = a + 1; i < array1.length; i++) {
                array1[i] = array[i - 1];
            }
            array = array1;
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public int remove(int a) {
        if (a >= 0 && a < array.length) {
            int[] array1 = new int[array.length - 1];
            int b = array[a];
            for (int i = 0; i < a; i++) {
                array1[i] = array[i];
            }
            for (int i = a + 1; i <array.length; i++) {
                array1[i - 1] = array[i];
            }
            array = array1;
            return b;

        } else throw new RuntimeException("  Индекс за границами массива");
    }
}





