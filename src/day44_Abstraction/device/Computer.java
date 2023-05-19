package day44_Abstraction.device;

public class Computer extends Device implements Downloadable,ComputerAdd{

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " can be turn on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " can be turn off");
    }

    @Override
    public void download() {
        System.out.println(getBrand() + " can download");
    }

    @Override
    public void desktop() {
        System.out.println(getModel() + "is a desktop");
    }

    @Override
    public void laptop() {
        System.out.println(getModel() + " is a laptop");
    }
}
/*
3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed
4. Create an interface named downloadable:

				Abstract method:
					downloadApp();
 */
