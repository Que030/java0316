package com.ocp.day23;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
         Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100); 
        scores.add(200); 
        scores.add(90);
        scores.add(-150);
        scores.add(80); 
        System.out.println(scores);
        
        int sum =scores.stream()
                .mapToInt(Integer :: intValue)
                .filter(Score::isVolid)
                .sum();
        System.out.println(sum);
        
    }
}
