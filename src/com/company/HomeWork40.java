package com.company;

public class HomeWork40 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int a = 1, j = 1;
            while (j <= i) {
                a = a * j;
                j++;
            }
            System.out.println(i + " факториал равен " + a);
            i++;
        }
    }
}
