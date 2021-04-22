package com.ocp.day07;

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder("Java cource");
        System.out.println("sb = "+sb);
        
        sb.delete(0, sb.length());//(0,11) 0~10
        System.out.println("sb = "+sb);
    }
}
