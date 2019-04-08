package com.company;

public class HomeWork32 {
    public static void main(String[] args) {
        int i =0;
        do {
            if (i > 5 & i < 20 & 2 * i > 5 & 2 * i < 20 & i % 2 == 0)
                System.out.println(i + " -Условие первое");
            else if (i > 5 & i < 20 & 2 * i > 5 & 2 * i < 20 & i % 2 == 1)
                System.out.println(i + " -Условие второе");
            else if (i > 21 & i < 100 & 2 * i > 21 & 2 * i < 100 & i / 3 > 5 & i / 3 < 20)
                System.out.println(i + " -Условие третье");
            else
                System.out.println(i + " -Число не соответствует условиям");
            i++;
        }
        while (i<100);

    }
}
