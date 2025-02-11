package ru.java.oop;

import ru.java.oop.car.Car;
import ru.java.oop.motorbike.Ural;


public class Main {

    public static void main(String[] args) {

        Car car = new Car(new Engine(10));
        System.out.println("car.wheelCount = " + car.wheelCount);
        car.drive();

        Ural ural = new Ural();
        System.out.println("ural.wheelCount = " + ural.wheelCount);
    }
}
