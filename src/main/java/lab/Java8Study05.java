package lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study05 {
    public static void main(String[] args) {
        String[] scores = {"80", "50" ,"70" ,"90" ,"40"};
        //請計算出及格成績的總和
        //Java8
        IntSummaryStatistics stat =Stream.of(scores)
                .mapToInt(s -> Integer.parseInt(s))
                .filter(s -> s >= 60)
                .summaryStatistics();
        System.out.printf("sum: %d max: %d min: %d"
                ,stat.getSum(),stat.getMax(),stat.getMin() );
    }
    
}
