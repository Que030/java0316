package com.ocp.day23;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {        
    //排序
    Set<Integer> num =new TreeSet<>();
    
        Random r = new Random();
        while(num.size()<7) {
            int n = r.nextInt(9)+1;
            System.out.println("n: "+ n);
            num.add(n);
        }
        System.out.println(num);
}
}