package OOP1.Task22;

public class Main {
    public static void main(String[] args) {
        MyIntArray array=new MyIntArray(3);
        System.out.println(array.size());
        array.print();
        array.addToTail(5);
        array.print();
        array.addToHead(7);
        array.print();
        array.insertAfter(4,6);
        array.print();
        array.insertBefore(0,6);
        array.print();
        System.out.println(array.remove(1));
        array.print();
        System.out.println(array.removeAfter(5));
        array.print();
        System.out.println(array.removeBefore(0));
        array.print();
        array.addToTail(5);
        MyIntArray array1 = new MyIntArray(10);
        array1.addToTail(1);
        array1.addToTail(2);
        array1.addToTail(3);
        array1.print();
        System.out.println(array.addAll(array1));
        array.print();


    }
}
