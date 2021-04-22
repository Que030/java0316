package com.ocp.day09;

public class WrapperDemo02 {
    public static void main(String[] args) {
        //Java 5.0前
        Integer a = new Integer(100);
        Integer b = new Integer(200);
        System.out.println(a.intValue() + b.intValue());
        
        //Java5.0後
        Integer a2 = 100;//編譯器幫你產生new Intger(100)自動裝箱
        Integer b2 = 200;
        System.out.println(a+b);
        
        int c = new   Integer(100);
        System.out.println(c);
    }
    
}
