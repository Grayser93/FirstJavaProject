package ru.java.oop;

public class Car extends Transport {

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

        System.out.println("car drive");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }
}
