package com.ocp.day12;

import java.util.stream.IntStream;

public class OverloadingDemo02 {

    public void calc(int x, int y) {
        System.out.println(x + y);
    }

    public void calc(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public void calc(int... array) {
        System.out.println(IntStream.of(array).sum());
    }

    public static void main(String[] args) {
        OverloadingDemo02 o = new OverloadingDemo02();

        o.calc();
        o.calc(10, 20);
        o.calc(10, 20, 30);
        o.calc(10, 20, 30, 40);
        

    }

}
