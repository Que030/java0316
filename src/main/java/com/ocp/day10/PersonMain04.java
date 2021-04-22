package com.ocp.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonMain04 {

    public static void main(String[] args) {
        Person[][] persons = {
            {new Person("John", 17, 170, 60.5),
                new Person("Mary", 18, 160, 50.5),},
            {new Person("Jo", 19, 155, 42.5),
                new Person("Helen", 16, 185, 75.5),
                new Person("Tom", 21, 190, 120.5),}
        };

        Function<Person, Double> getbmi = p -> p.getWeight() / Math.pow(p.getHeight() / 100, 2);

        Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getbmi::apply)
                .forEach(System.out::println);

        //請問哪一個人bmi最大
        double maxbmi = Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getbmi::apply)
                .summaryStatistics()
                .getMax();

        Consumer<Person> printPerson = p -> {
            System.out.printf("%s %d %.1f kg %.2f\n",
                    p.getName(), p.getAge(), p.getHeight(), p.getWeight(), getbmi.apply(p));
        };

        Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .filter(p -> getbmi.apply(p) == maxbmi)
                .forEach(printPerson);
    }
;
}
