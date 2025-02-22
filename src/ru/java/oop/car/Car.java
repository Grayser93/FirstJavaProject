package ru.java.oop.car;

import ru.java.oop.Engine;
import ru.java.oop.Transport;

public class Car extends Transport {

    public Car(String name, String model, String color) {
        super(name, model, color);
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(int number, Engine engine) {
        this.number = number;
        this.engine = engine;
    }

    public Car(Engine engine) {
        this.engine =  engine;
    }

    public Car() {
    }

    private int number;
    private Engine engine;
    public final int wheelCount = 4;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

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
//        super.drive();
//        super.stop();

        System.out.println("drive car with wheelCount = " + wheelCount);
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }
}
