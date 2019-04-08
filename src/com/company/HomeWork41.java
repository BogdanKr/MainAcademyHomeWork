package com.company;

public class HomeWork41 {
    public static void main(String[] args) {
        int i = 1;
        do {
            int a = 1, j = 1;
            do {
                a = a * j;
                j++;
            }
            while (j <= i);
            System.out.println(i + " факториал равен " + a);
            i++;
        }
        while (i <= 5);
    }
}
