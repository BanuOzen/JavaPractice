package day44_Abstraction.car;

import day44_Abstraction.car.AutoPark;
import day44_Abstraction.car.AutoPilot;
import day44_Abstraction.car.Car;

public class Tesla extends Car implements AutoPark, AutoPilot {

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
