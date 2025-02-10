package ru.java.oop;

import ru.java.oop.car.Car;
import ru.java.oop.morobike.Kawasaki;
import ru.java.oop.morobike.Ural;

public class Main {

    public static void main(String[] args) {
////
//        Bmw bmw = new Bmw();
////
//        Car car = new Car("a", "b", "c", 10);

//        System.out.println("car.getColor() = " + car.getColor());
//        System.out.println("car.getModel() = " + car.getModel());
//        System.out.println("car.getName() = " + car.getName());
//        System.out.println("car.getNumber() = " + car.getNumber());

//        Toyota toyota = new Toyota();

//        toyota.drive();
////
//        Kawasaki kawasaki = new Kawasaki("kawa","super model", "white",5.5, 2000);
//        kawasaki.jump();
//
//        Ural ural = new Ural("ural","new model", "red", 5.7, true);
//        ural.showInfo();

        Engine engine = new Engine(10);
//        engine. setVolume(10);

        Car car = new Car(10, engine);
//        car.setEngine(engine);

//        System.out.println("car.getEngin() = " + car.getEngine());
        System.out.println("car.getEngine().getVolume() = " + car.getEngine().getVolume());

    }
}
