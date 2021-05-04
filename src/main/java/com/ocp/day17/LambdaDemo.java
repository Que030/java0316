package com.ocp.day17;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {

        IntStream.of(100, 50, 70, 80, 30)
//                .peek( x ->System.out.println(x.getClass().getTypeName()))
                .forEach(x -> System.out.println(x));
   
        Stream.of(100, 50, 70, 80, 30)
                .filter(x -> x >=60 )
                .forEach(System.out::println);
        
        Stream.of("Mary","John","Bob","Helen")
                .mapToInt(String :: length)
                .forEach(System.out::println);
    }
}
