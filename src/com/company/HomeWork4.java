package com.company;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        if (a % 5 == 3 & a < 50)
            System.out.println("Число подпадает под первое условие");

    }
}
