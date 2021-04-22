package com.ocp.day07;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
      
        System.out.println(s1.intern()==s2);
        System.out.println(s1.intern()==s2.intern());
    }
}
