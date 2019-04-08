package OOP.Task16;

public class Main {
    public static void main(String[] args) {
        MyIntArray array = new MyIntArray(3);
        System.out.println(array.size());
        array.print();
        array.addToTail(5);
        array.addToTail(6);
        array.print();
        array.addToHead(2);
        array.addToHead(1);
        array.print();
        System.out.println(array.get(1));

    }
}
