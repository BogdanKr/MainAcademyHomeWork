package com.company;

public class HomeWork38 {
    public static void main(String[] args) {
        int i = 10;
        do {
            int j = 10;
            do {
                if (j % i == 0)
                    System.out.println(j + " делится на " + i + " без остатка   ");
                j++;}
            while (j<201);
            i++;}
        while (i<201);
    }
}
