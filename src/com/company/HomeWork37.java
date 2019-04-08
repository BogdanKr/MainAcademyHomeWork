package com.company;

public class HomeWork37 {
    public static void main(String[] args) {
        int i = 10;
        while (i<201){
            int j = 10;
            while (j<201){
                if (j % i == 0)
                    System.out.println(j + " делится на " + i + " без остатка   ");
            j++;}
        i++;}
    }
}
