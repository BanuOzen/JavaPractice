package day44_day45_Abstraction.device;

public class Google extends Phone implements Downloadable, AndroidApps{
    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, phoneNumber);
    }

    @Override
    public void OS() {
        System.out.println(getBrand() + " not use OS");
    }

    @Override
    public void download() {
        System.out.println(getBrand() + " can be download");
    }
}
