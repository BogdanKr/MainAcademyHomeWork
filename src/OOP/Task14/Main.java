package OOP.Task14;

public class Main {
    public static void main(String[] args) {
        MyIntArray array = new MyIntArray(4);

        System.out.println(array.size());
        array.print();
        array.addToTail(5);
        array.addToTail(3);
        array.print();
        System.out.println(array.size());
    }
}
