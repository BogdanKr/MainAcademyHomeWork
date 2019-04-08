package com.company;

public class HomeWork39 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            int a = 1;
            for (int j = 1; j <= i; j++) {
                a=a*j;
            }
            System.out.println(i+" факториал равен " + a);
        }
    }
}
