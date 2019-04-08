package OOP1.Task32;

public class Main {
    public static void main(String[] args) {
        String s = "1100 * 2 =";
        Parser parsing = new Parser();
        Calculator calculate = new Calculator();
        System.out.println(calculate.calc(parsing.pars(s)));

    }
}
