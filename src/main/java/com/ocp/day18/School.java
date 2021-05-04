package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class School {
    public static void main(String[] args) {
        Arrays.stream(DataCenter.getPeople())
                .forEach(System.out::println);
        
        
        IntSummaryStatistics  stat =Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .mapToInt(x -> ((Student)x).getScore())
                .summaryStatistics();
        
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
        
         IntSummaryStatistics t = Arrays.stream(DataCenter.getPeople())
                 .filter(a ->a instanceof Teacher)           
                 .mapToInt(a -> ((Teacher)a).getSalary())
                 .summaryStatistics();
         
         System.out.println(t.getSum());
         System.out.println(t.getAverage());
         
         Consumer<Student> p = x -> System.out.printf(" 學生:%s 分數:%d 老師: %s\n",x.getName(),x.getScore(),x.getTeacher().getName());
         double avg = Arrays.stream(DataCenter.getPeople())
                 .filter(x ->x instanceof Student)
                 .map(x -> (Student)x)
                 .filter(x-> x.getScore()<60)
                 .peek(p)
                 .mapToInt(Student::getScore)
                 .average()
                 .getAsDouble();
         
         System.out.println("不及格平均:"+avg);
    }
}
