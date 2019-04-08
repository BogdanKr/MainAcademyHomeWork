package com.company;

import java.util.Scanner;


public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        if ((a+500)<600)
            System.out.println("Сумма меньше 600");
        else
            System.out.println("Сумма больше 600");


    }
}
