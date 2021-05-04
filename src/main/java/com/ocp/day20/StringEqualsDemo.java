package com.ocp.day20;

public class StringEqualsDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = new String(new char[]{'J','a','v','a'});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        
        //==使用 : a 與 b 是否指向同一物件(stack)
        String a ="java";
        String b = a;
        System.out.println(a==b);
        
        //hash code 值
        String foo = "Java";
        String bar = new String("Java");
        System.out.println(bar.equals(foo));
        System.out.println(bar.hashCode());
        System.out.println(foo.hashCode());
    }
}
