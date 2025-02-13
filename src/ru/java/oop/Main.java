package ru.java.oop;

import ru.java.oop.car.Bmw;
import ru.java.oop.car.Car;
import ru.java.oop.car.Toyota;
import ru.java.oop.motorbike.Ural;


public class Main {

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.year = 2000;
        System.out.println("toyota.year = " + toyota.year);

        Bmw bmw = new Bmw();
        System.out.println("bmw.year = " + bmw.year);

    }
}
