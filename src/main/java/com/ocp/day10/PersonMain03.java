package com.ocp.day10;

import java.util.DoubleSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonMain03 {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),};
        
        Function<Person,Double>getbmi = p -> p.getWeight()/Math.pow(p.getHeight()/100, 2);
        DoubleSummaryStatistics stat = Stream.of(persons).mapToDouble(getbmi :: apply)//p -> getbmi.Apply(p)
                .summaryStatistics();
        
        System.out.printf("平均: %.2f 最大:　%.2f 最小: %.2f",stat.getAverage(),stat.getMax(),stat.getMin());
    }
    
}
