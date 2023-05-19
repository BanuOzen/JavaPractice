package day44_Abstraction.car;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " push the start");
    }

    @Override
    public void drive() {

    }

    @Override
    public void autoPark() {

    }


}


