package com.ocp.day15;

import java.util.stream.Stream;

public class Army {

    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        Oil[] oils = {tank, truck, fighter};
        Car[] cars = {tank, truck};
        Weapon[] weapons = {tank, fighter};

        Stream.of(cars).forEach(c -> c.move());

        Stream.of(weapons).forEach(c -> c.shoot());

        int sum = Stream.of(oils)
                .mapToInt(Oil::spend).sum();

        System.out.println(sum);

    }
}
