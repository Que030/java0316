package com.ocp.day06;

import java.util.Arrays;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70, 50, 40, 100, 75, 15};
        System.out.printf("%s, 長度: %d \n", Arrays.toString(scores), scores.length);

        int sum = 0;
        double avg = 0;
        
        for (int i = 1; i < scores.length; i++) {
            sum += scores[i];
            
        }
        avg = (double)sum / scores.length;
        System.out.printf("總分: %d 平均: %1f\n", sum, avg);

        int max = 0 ;
        for (int j = 0; j < scores.length; j++) {
            if (max < scores[j]) {
                max = scores[j];
                
            }
              
        }
      System.out.println(max);
    }

}
