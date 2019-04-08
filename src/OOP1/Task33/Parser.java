package OOP1.Task33;

public class Parser {
    private String[] par;
    private String test;
    private int a = 0;

    public String[] pars(String s) {
        test = s;
        // считаю количество цифр в уравнении и дейсвтий - размер массива
        while (!test.startsWith("=")) {
            int space = test.indexOf(" ");
            test = test.substring(space + 1);
            a++;
        }

        // наполняю массив
        par = new String[a];
        for (int i = 0; i < a; i++) {
            int space = s.indexOf(" ");
            par[i] = s.substring(0, space);
            s = s.substring(space + 1);
        }
        return par;
    }

}

