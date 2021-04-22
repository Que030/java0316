package com.ocp.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain02 {
    public static void main(String[] args) {
                Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),};
                
                
                //建立BMI計算邏輯,使用function<T,R>
                //https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
                //T 代表傳入參數型別,(person)
                //R 代表回傳資料型別,(double)
                Function<Person ,Double>getBMI = p -> p.getWeight()/ Math.pow(p.getHeight()/100, 2);
                
                Predicate<Person>normalBMI = p -> getBMI.apply(p) >18 && getBMI.apply(p) <= 23;
                //印出人名
                Consumer<Person> printName = p -> System.out.println(p.getName());
                //印出BMI正常的人名
                Stream.of(persons).filter(normalBMI).forEach(p -> System.out.println(p.getName()));
    }
    
}
