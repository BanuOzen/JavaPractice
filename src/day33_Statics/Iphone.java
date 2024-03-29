package day33_Statics;

public class Iphone {

    public String model, color;
    public double price;
    public String size;

    public static String brand = "Apple", OS = "İOS", madeIn = "China";

    public Iphone(String model, String color, double price, String size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is face timing with number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is face timing with email " + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(model + " is texting to " + phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */