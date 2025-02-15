package ru.java.oop;

import ru.java.oop.car.Bmw;
import ru.java.oop.car.Car;
import ru.java.oop.car.Toyota;
import ru.java.oop.motorbike.Ural;


public class Main {

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        System.out.println(toyota.year);

        Car car = new Car();
        System.out.println(car.year);

//          System.out.println(Car.formatText("asdasdas"));


}
}
