package com.company;

//задания 24 и 25
public class HomeWork24 {
    public static void main(String[] args) {
        int i = 2;
        while (i < 7) {
            int j = 1;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
