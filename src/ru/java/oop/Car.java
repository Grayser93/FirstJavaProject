package ru.java.oop;

public class Car extends Transport {

    public Car(String name, String model, String color) {
        super(name, model, color);
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(int number) {
        this.number = number;
    }

    public Car() {
        System.out.println("car");
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void signal() {
        System.out.println("signal");
    }

    @Override
    public void drive() {
        super.drive();
        super.stop();

        System.out.println("car drive");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }
}
