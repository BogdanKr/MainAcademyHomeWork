package com.company;

//задания 28 и 29
public class HomeWork28 {
    public static void main(String[] args) {

        int i = 2;
        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            }
            while (j < i);
            System.out.println();
            i++;
        }
        while (i < 7);
        System.out.println();

        i = 5;
        do {
            int j = i;
            do {
                System.out.print(j + " ");
                j--;
            }
            while (j > 0);
            System.out.println();
            i--;
        }
        while (i > 0);
    }
}
