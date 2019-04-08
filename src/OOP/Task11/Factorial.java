package OOP.Task11;

public class Factorial {
    private int a;
    private int b=1;
    public Factorial(int fact) {
        a = fact;
    }

    public void getFactorial() {
        for (int i = 1; i <= a; i++) {
            b=b*i;
        }
        System.out.println("Fatorial "+a+" raven= "+b);
    }
}
