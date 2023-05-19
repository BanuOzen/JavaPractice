package day44_Abstraction.device;

public class Samsung extends Phone implements Downloadable, AndroidApps {

    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, phoneNumber);
    }

    @Override
    public void OS() {
        System.out.println(getBrand() + " " + getModel() + " use to appstore");
    }

    @Override
    public void download() {
        System.out.println(getBrand() + " " + getModel() + " can be download");
    }
}
/*
2. Samsung: extends Phone class and implements Downloadable & AndroidApps interfaces
 */