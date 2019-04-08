package com.company;

//задания 26 27
public class HomeWork26 {
    public static void main(String[] args) {
        int i = 0;
        do {
            int j = 10;
            do {
                System.out.print(j + " ");
                j++;
            } while (j < 15);
            System.out.println();
            i++;
        }
        while (i < 5);
        System.out.println();

        i = 0;
        do {
            int j = 5;
            do {
                System.out.print(j + " ");
                j--;
            }
            while (j > 0);
            System.out.println();
            i++;
        }
        while (i < 5);
    }
}
