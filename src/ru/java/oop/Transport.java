package ru.java.oop;

public class Transport {

    public Transport() {

    }

    public Transport(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    private String name;
    private String model;
    private String color;
    public final static int year = 2000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void drive() {
        System.out.println("drive transport");
    }

    public void stop() {
        System.out.println("stop transport");
    }

    public static String formatText(String text) {
        return text + "!!!";
    }

}
