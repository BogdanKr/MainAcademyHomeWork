package OOP.Task15;

public class Main {
    public static void main(String[] args) {
        MyIntArray array = new MyIntArray(5);

        array.print();
        System.out.println(array.size());

        array.addToTail(6);
        array.print();
        array.addToHead(1);
        array.addToHead(2);
        array.print();
    }
}
