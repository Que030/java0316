package lab;

import java.util.stream.Stream;

public class Java8Study06 {
    public static void main(String[] args) {
        String[] names = {"banana" ,"watermelon","apple","orange","mango"};
        //求names為偶數字母的總和
        int sum = Stream.of(names)
                .mapToInt(String ::length)
                .filter(s -> s%2 == 0)
                .sum();
        System.out.println(sum);
               
    }
    
}
