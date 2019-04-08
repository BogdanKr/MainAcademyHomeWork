package com.company;

import java.util.Scanner;


public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        if (a > 5 & a < 20 || a > 30 & a < 50 || a > 70 & a < 80)
            System.out.println("Число в первых диапазонах");
        else if (a > 21 & a < 29 || a > 51 & a < 69)
            System.out.println("Число находится во вторых диапазонах");
        else
            System.out.println("Число не лежит в диапазонах");
    }
}
