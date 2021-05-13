package com.ocp.day23;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo6 {
    public static void main(String[] args) {
        Set<Integer> data = new HashSet<>();
        data.add(100);
        data.add(80);
        data.add(90);
        
        data = new TreeSet<>(data);
        System.out.println(data);
        
        
        
            }
}
