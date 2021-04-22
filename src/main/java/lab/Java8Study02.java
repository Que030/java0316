package lab;

import java.util.stream.IntStream;

public class Java8Study02 {

    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        //列印及格分數
        //java7
        for (int i : scores) {//foreach
            if (i >= 60) {//filter
                System.out.println(i);
            }            
            
        }
        //java8
        IntStream.of(scores)
                .filter(s -> s >= 60)
                .forEach(s -> System.out.println(s));
        
    }    
    
}
