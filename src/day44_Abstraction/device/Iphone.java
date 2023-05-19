package day44_Abstraction.device;

public class Iphone extends Phone implements Downloadable,AppleApps{

    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, phoneNumber);
    }

    @Override
    public void OS() {
        System.out.println(getBrand() + " " + getModel() + " use iOS");
    }

    @Override
    public void download() {
        System.out.println(getBrand() + " " + getModel() + " can be download");
    }
}
