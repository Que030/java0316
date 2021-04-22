package com.ocp.day07;

public class StringEquals2 {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = "java";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        s1 = s1.intern();//放入池
        System.out.println(s1 == s2);
        
       String s3 = "JAVA";
          System.out.println(s2 == s3);
          System.out.println(s2.equals(s3));
          System.out.println(s2.equalsIgnoreCase(s3));//忽略大小寫
        
    }
    
}
