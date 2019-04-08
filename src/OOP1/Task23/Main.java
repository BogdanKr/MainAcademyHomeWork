package OOP1.Task23;

public class Main {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        MyIntArray array = new MyIntArray(0);
        for (int i = 0; i < 100000; i++) {
            array.addToTail(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time creation array    " + (endTime - starTime) + " ms");

        starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            array.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time remove 10000 elements    " + (endTime - starTime) + " ms");

        starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            array.removeBefore(2);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time removeBefore (10000elem)    " + (endTime - starTime) + " ms");

        starTime = System.currentTimeMillis();
        MyIntArray array2 = new MyIntArray(0);
        for (int i = 0; i < 200000; i++) {
            array2.addToHead(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time creat second array    " + (endTime - starTime) + " ms");

        starTime = System.currentTimeMillis();
        array.addAll(array2);
        endTime = System.currentTimeMillis();
        System.out.println("Time copy second array with first    " + (endTime - starTime) + " ms");
    }
}
