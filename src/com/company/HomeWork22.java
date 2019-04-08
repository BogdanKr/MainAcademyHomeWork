package com.company;

//задания 22 23
public class HomeWork22 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 10;
            while (j < 15) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        i = 0;
        while (i < 5) {
            int j = 5;
            while (j > 0) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
