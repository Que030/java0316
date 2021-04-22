package lab;

import java.util.stream.IntStream;

public class Java8Study03 {
    public static void main(String[] args) {
        int[] scores = {80, 50 ,70 ,90 ,40};
        //請算出總分與平均
        //java7
        int sum = 0;
        double avg = 0;
        for(int i : scores){
        sum += i;
        }
        avg = (double)sum/scores.length;
        System.out.println(sum);
        System.out.println(avg);
        
        
        
        
        //java8
        int sum2 = IntStream.of(scores).sum();
        double avg2 = IntStream.of(scores).average().getAsDouble();
        System.out.println(sum2);
        System.out.println(avg2);
        }
    }
    

