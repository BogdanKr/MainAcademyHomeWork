package OOP1.Task33;

public class Main {
    public static void main(String[] args) {
        String s = "500 * 30 - 10000 + 10000 / 20 - 2000 * 3 - 1000 * 2 =";

        String[] uravnenie;
        Parser par = new Parser();
        Calculator rezultat = new Calculator();

        uravnenie = par.pars(s); //входящий формат уравнения перевел в массив символов

        System.out.println(rezultat.Calc(uravnenie));
    }
}
