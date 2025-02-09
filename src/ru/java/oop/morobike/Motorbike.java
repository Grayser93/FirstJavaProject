package ru.java.oop.morobike;

import ru.java.oop.Transport;

public class Motorbike extends Transport {

    public Motorbike() {

    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }

    public Motorbike(String name, String model, String color) {
        super(name, model, color);
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
