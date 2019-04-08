package OOP.Task12;

public class MyIntArray {
    private int[] array;
    private int a;

    public MyIntArray(int a) {
        this.a = a;
        array = new int[a];
    }

    public int size() {
        a = array.length;
        return a;
    }
}
