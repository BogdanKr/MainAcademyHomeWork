package OOP1.Task31;

public class Calculator {
    public int calc(String s) {
        int space1 = s.indexOf(' ');
        String sub1 = s.substring(0, space1);
        s = s.substring(space1 + 1);
        String deistvie = s.substring(0, 1);
        s = s.substring(2);
        int space2 = s.indexOf(' ');
        String sub2 = s.substring(0, space2);

        if (deistvie.startsWith("+"))
            return Integer.parseInt(sub1) + Integer.parseInt(sub2);
        else if (deistvie.startsWith("-"))
            return Integer.parseInt(sub1) - Integer.parseInt(sub2);
        else if (deistvie.startsWith("*"))
            return Integer.parseInt(sub1) * Integer.parseInt(sub2);
        else return Integer.parseInt(sub1) / Integer.parseInt(sub2);
    }

}
