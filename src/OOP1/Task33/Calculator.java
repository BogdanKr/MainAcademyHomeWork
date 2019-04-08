package OOP1.Task33;

public class Calculator {
    private String[] s;
    private int[] b;
    private int rez;

    public int Calc(String[] s) {
        int a = s.length;
        // прохожу массив символов ищу умножение или деление и выполняю операцию,меняю потом массив после проведение операции
        // прохожусь между цифрами смотрю знак какой, если * или / выполняю дейсвие и ставлю результат в массив, иду дальше
        for (int i = 0; i < a; i++) {
            if (i % 2 == 1 && s[i].startsWith("*")) {
                rez = Integer.parseInt(s[i - 1]) * Integer.parseInt(s[i + 1]);
                s[i - 1] = "0";
                s[i + 1] = Integer.toString(rez);
                if (i > 1)
                    s[i] = s[i - 2];
                else s[i] = "+";
            } else if (i % 2 == 1 && s[i].startsWith("/")) {
                rez = Integer.parseInt(s[i - 1]) / Integer.parseInt(s[i + 1]);
                s[i - 1] = "0";
                s[i + 1] = Integer.toString(rez);
                s[i] = s[i - 2];
            }
        }

        // теперь + или -
        for (int i = 0; i < a; i++) {
            if (i % 2 == 1 && s[i].startsWith("+")) {
                rez = Integer.parseInt(s[i - 1]) + Integer.parseInt(s[i + 1]);
                s[i + 1] = Integer.toString(rez);
            } else if (i % 2 == 1 && s[i].startsWith("-")) {
                rez = Integer.parseInt(s[i - 1]) - Integer.parseInt(s[i + 1]);
                s[i + 1] = Integer.toString(rez);
            }
        }
        return Integer.parseInt(s[a - 1]);
    }
}
