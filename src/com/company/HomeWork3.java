package com.company;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        if (a >= 10)
            System.out.println("Число больше 10");
        else if (a > 7 && a < 10)
            System.out.println("Число больше 7");
        else System.out.println("Число меншье 7");
    }
}
