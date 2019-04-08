package com.company;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        System.out.println("Введите число 1: ");
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        System.out.println("Введите число 2: ");
        int b = first.nextInt();
        if (a > b & ((a - b) < 5) & (a % 2 == 0) & (b % 2 == 0))
            System.out.println("Разница между числами меньше 5 оба четные");
        else if (a > b & ((a - b) > 10) & a % 2 == 1 & b % 2 == 1)
            System.out.println("Разница между числами больше 10 оба нечетные" );
        else if (b > a)
            System.out.println("Второе число больше чем первое" );
        else
            System.out.println("Числа не соответствуют условиям" );



    }
}
