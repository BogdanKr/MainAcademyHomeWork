package com.company;

public class HomeWork36 {
    public static void main(String[] args) {
        for (int i = 10; i < 201; i++) {
            for (int j = 10; j < 201; j++) {
                if (j % i == 0)
                    System.out.println(j + " делится на " + i + " без остатка   ");
            }
        }
    }
}
