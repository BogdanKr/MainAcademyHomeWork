package OOP.Task19;

public class Main {
    public static void main(String[] args) {
        MyIntArray array = new MyIntArray(3);
        System.out.println(array.size());
        array.print();
        array.addToTail(5);
        array.print();
        System.out.println(array.size());
        array.addToHead(1);
        array.print();
        System.out.println(array.get(4));
        array.insertAfter(0,2);
        array.print();
        array.insertBefore(0,0);
        array.insertBefore(6,4);
        array.print();
        System.out.println(array.remove(1));
        array.print();

    }
}
