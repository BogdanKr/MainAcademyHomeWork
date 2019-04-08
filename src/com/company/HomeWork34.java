package com.company;

public class HomeWork34 {
    public static void main(String[] args) {
        int i = 0;
        while (i<100) {
            if (i > 5 & i < 20 || i > 30 & i < 50 || i > 70 & i < 80)
                System.out.println(i + " -Число в первых диапазонах");
            else if (i > 21 & i < 29 || i > 51 & i < 69)
                System.out.println(i + " -Число находится во вторых диапазонах");
            else
                System.out.println(i + " -Число не лежит в диапазонах");
            i++;
        }
    }
}
