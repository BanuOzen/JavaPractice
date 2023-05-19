package day44_Abstraction.device;

public class Phone extends Device{

    private final long phoneNumber;

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long phoneNumber) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void call(){
        System.out.println("Call number: " + phoneNumber);
    }
    public void text(){
        System.out.println("Text phone number: " + phoneNumber);
    }

    @Override
    public void turnOn() {
        System.out.println();
    }

    @Override
    public void turnOff() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Phone{" +
                super.toString() +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()
 */