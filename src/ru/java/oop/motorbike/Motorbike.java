package ru.java.oop.motorbike;

import ru.java.oop.Transport;

public class Motorbike extends Transport {

    public final int wheelCount;

    public Motorbike(String name, String model, String color, int wheelCount) {
        super(name, model, color);
        this.wheelCount = wheelCount;
    }

//    public Motorbike() {
//
//    }
//
//    public Motorbike(String name, String model, String color, double volume) {
//        super(name, model, color);
//        this.volume = volume;
//    }

//    public Motorbike(String name, String model, String color) {
//        super(name, model, color);
//    }

    private double volume;
//    public final int wheelCount = 2;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
