package com.ocp.day11;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Extendsemo {

    public static void main(String[] args) {
        //操作Employee ,manager ,Director
        Employee e1 = new Employee();
        e1.setSalary(3_0000);
        Employee e2 = new Employee();
        e2.setSalary(4_0000);
        Employee e3 = new Employee();
        e3.setSalary(5_0000);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Manager m1 = new Manager();
        m1.setSalary(7_0000);
        m1.setBudget(10_0000);

        Manager m2 = new Manager();
        m2.setSalary(8_0000);
        m2.setBudget(15_0000);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Director d1 = new Director();
        d1.setSalary(20_0000);
        d1.setBudget(50_0000);
        d1.setStockoption(300_0000);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //總薪資(salary)
        System.out.println("求salary的總薪資");
        Employee[] employees = {e1, e2, e3, m1, m2, d1};
        //java 7
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.printf("總薪資 = %,d\n", sum);
        //~~~~~~~~~~~~
        int sum2 = 0;
        for (Employee e : employees) {
            //System.out.println(e);            
            sum2 += e.getSalary();
        }
        System.out.println(sum2);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~        
        //java8
        int sum3 = Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        System.out.printf("總薪資 =　%,d\n", sum3);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~
        int sum4 = Stream.of(employees).mapToInt(Employee::getSalary).sum();
        System.out.println(sum4);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //求manager的總薪資
        System.out.println("求manager的總薪資");
        //java7
        int sum5 = 0;
        for (Employee e : employees) {
            if (e.getClass().getSimpleName().equals("Employee")) {
                sum = sum;
            } else {
                sum5 += e.getSalary();
            }
        }
        System.out.printf("manager的總薪資 = %,d \n",sum5);
        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //java8
        int sum6 = Stream.of(employees)
                .filter(e -> e.getClass().getSimpleName().equals("Manager")||e.getClass().getSimpleName().equals("Director"))
                .mapToInt(Employee::getSalary).sum();
        System.out.println(sum6);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //利用 instanceof
        for(Employee e : employees){
            System.out.println(e instanceof Manager );
        }
        Consumer<? super Employee> action;
        
        int sum7 = Stream.of(employees)
                .filter(e -> e instanceof Manager)
                .peek(System.out::println)
                .mapToInt(Employee :: getSalary)
                .peek(System.out::println)
                .sum();
        System.out.println(sum7);
        
    }

}

