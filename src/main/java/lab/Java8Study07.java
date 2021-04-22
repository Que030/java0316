package lab;

import java.util.stream.Stream;

public class Java8Study07 {
    public static void main(String[] args) {
        String[][] names = {{"Jo","Mary"},{"John","Helen"},{"Bob"}};
        
        int sum = Stream.of(names)
                .flatMap( s -> Stream.of(s))
                 .mapToInt(s -> s.length())
                 .sum();
        
        System.out.println(sum);
    }
    
}
