package com.ocp.day08;

public class XOGame {

    public static void main(String[] args) {
        char[][] xo = new char[3][3];
        print(xo);
        
        System.out.println("請輸入0到8");
        xo[0][0] = 'O' ;
        print(xo);
    }

    public static void print(char[][] xo) {
        for (char[] x : xo) {
            System.out.print("| ");
            for (char y : x) {
                System.out.print(y + " | ");
            }
            System.out.println();
        }

    }
}
