package OOP1.Task32;

public class Parser {
    private String[] par = new String[3];

    public String[] pars(String s) {
        int space1 = s.indexOf(" ");
        par[0] = s.substring(0, space1); //first number

        s = s.substring(space1 + 1);
        par[1] = s.substring(0, 1); //deistvie

        s = s.substring(2);
        int space2 = s.indexOf(" ");
        par[2] = s.substring(0, space2); //second number

        return par;
    }
}
