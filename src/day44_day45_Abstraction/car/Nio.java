package day44_day45_Abstraction.car;

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
