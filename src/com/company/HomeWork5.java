package com.company;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        if (a > 5 & a < 20 & 2 * a > 5 & 2 * a < 20 & a%2==0)
            System.out.println("Условие первое");
        else if (a > 5 & a < 20 & 2 * a > 5 & 2 * a < 20 & a%2==1)
            System.out.println("Условие второе");
        else if (a > 21 & a < 100 & 2 * a > 21 & 2 * a < 100 & a/3>5 & a/3<20)
            System.out.println("Условие третье");
        else
            System.out.println("Число не соответствует условиям");


    }
}
