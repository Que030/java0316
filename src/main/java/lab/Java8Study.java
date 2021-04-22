package lab;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study {
    public static void main(String[] args) {
        int[] scores = {80 ,50 ,70 ,90 ,40};
        //請印出所有成績
        //java 7
        for (int s : scores) {
        System.out.println(s);
        
        //java 8(利用 Stream.of() 來進行資料分析)
            //IntStream.of(scores).forEach(s -> System.out.println(s));
            IntStream.of(scores).forEach( System.out::println);
            
        }
    }
    
}
