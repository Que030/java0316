package com.ocp.day16;

import java.util.Random;

public class LuckNumberMain {
    public static void main(String[] args) {
//1~9
        LuckNumber num = () -> new Random().nextInt(9) + 1;
        System.out.println(num.get());
   
//1~49 
        LuckNumber num2 = ()->{
        Random e = new Random();
        int n = e.nextInt(49)+1;
        return n;
        };
        System.out.println(num2.get());
    
    }
}
