package ru.java.oop;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("a", "b", "c", 10);

        System.out.println("car.getColor() = " + car.getColor());
        System.out.println("car.getModel() = " + car.getModel());
        System.out.println("car.getName() = " + car.getName());
        System.out.println("car.getNumber() = " + car.getNumber());

    }
}
