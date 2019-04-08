package com.company;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner first = new Scanner(System.in);
        int a = first.nextInt();
        if (a > 5)
            System.out.println("Число больше пяти");

    }
}
