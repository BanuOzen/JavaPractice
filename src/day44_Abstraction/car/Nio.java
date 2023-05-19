package day44_Abstraction.car;

import day44_Abstraction.car.AutoPark;
import day44_Abstraction.car.AutoPilot;
import day44_Abstraction.car.Car;

public abstract class Nio extends Car implements AutoPark, AutoPilot {
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }
}
