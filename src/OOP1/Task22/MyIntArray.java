package OOP1.Task22;

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
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = b;
        array = newArray;
    }

    public void addToHead(int c) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        newArray[0] = c;
        array = newArray;
    }

    public int get(int d) {
        if (d >= 0 && d < array.length) {
            return (array[d]);
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public void insertAfter(int a, int b) {
        if (a >= 0 && a < array.length) {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i <= a; i++) {
                newArray[i] = array[i];
            }
            newArray[a + 1] = b;
            for (int i = a + 2; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public void insertBefore(int a, int b) {
        if (a >= 0 && a < array.length) {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < a; i++) {
                newArray[i] = array[i];
            }
            newArray[a] = b;
            for (int i = a + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            array = newArray;
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public int remove(int a) {
        if (a >= 0 && a < array.length) {
            int[] newArray = new int[array.length - 1];
            int b = array[a];
            for (int i = 0; i < a; i++) {
                newArray[i] = array[i];
            }
            for (int i = a; i < newArray.length; i++) {
                newArray[i] = array[i + 1];
            }
            array = newArray;
            return b;
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public int removeAfter(int a) {
        if (a >= 0 && a < array.length) {
            int b = array.length - a;
            int[] newArray = new int[array.length - b];
            for (int i = 0; i < a; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            return b;
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public int removeBefore(int a) {
        if (a >= 0 && a < array.length) {
            int b = a + 1;
            int[] newArray = new int[array.length - b];
            for (int i = a + 1; i < array.length; i++) {
                newArray[i - b] = array[i];
            }
            array = newArray;
            return b;
        } else throw new RuntimeException("  Индекс за границами массива");
    }

    public int addAll(MyIntArray copyFrom) {
        int[] newArray = new int[array.length + copyFrom.size()];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        int j = 0;
        for (int i = array.length; i < array.length + copyFrom.size(); i++) {
            newArray[i] = copyFrom.get(j);
            j++;
        }
        array = newArray;
        return copyFrom.size();
    }
}
