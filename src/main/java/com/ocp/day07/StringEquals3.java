package com.ocp.day07;

public class StringEquals3 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        System.out.println(s1 == s2);
        s1 = s1 + "8";
        s2 = s2.concat("8");//s2 + "8"
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        
        System.out.println(s1.intern() == s2.intern());
    }
    
}
