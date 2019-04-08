package OOP1.Task32;

public class Calculator {

    public int calc(String[] sub) {
        if (sub[1].startsWith("+"))
            return Integer.parseInt(sub[0]) + Integer.parseInt(sub[2]);
        else if (sub[1].startsWith("-"))
            return Integer.parseInt(sub[0]) - Integer.parseInt(sub[2]);
        else if (sub[1].startsWith("*"))
            return Integer.parseInt(sub[0]) * Integer.parseInt(sub[2]);
        else return Integer.parseInt(sub[0]) / Integer.parseInt(sub[2]);
    }

}

