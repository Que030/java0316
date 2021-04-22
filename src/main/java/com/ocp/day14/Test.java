package com.ocp.day14;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;
 
public class Test {
    public static void main(String[] args) {
        Employee e1 = new PG();
        e1.setSalary(5_0000);
        Employee e2 = new PG(7_0000);
        
        Employee e3 = new Art(2_8000);
        Employee e4 = new Art();
        e4.setSalary(6_0000);
        
        Employee[] employees = {e1 ,e2 ,e3 ,e4};
        Stream.of(employees).forEach(e -> e.job());
        
    
        IntSummaryStatistics stat =Stream.of(employees)
                                    .mapToInt(Employee::getSalary)
                                    .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
                                    
    
    }
}


