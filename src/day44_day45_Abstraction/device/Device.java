package day44_day45_Abstraction.device;

public abstract class Device {

    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private final boolean hasBattery;
    private final boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if( brand == null || brand.isEmpty() ){
            throw new RuntimeException("Can not be null and empty" + getBrand());
        }
        this.brand = brand;

        if( model == null || model.isEmpty()){
            throw new RuntimeException("Can not be null and empty" + getModel());
        }
        this.model = model;

        setPrice(price);
        setColor(color);

        if( size == null || size.isEmpty()){
            throw new RuntimeException("Can not be null and empty" + getSize());
        }
        this.size = size;

        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if( price <= 0 ){
            throw new RuntimeException("Invalid Price: " + getPrice());
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if( color == null || color.isEmpty()){
            throw new RuntimeException("Can not be null and empty");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }


    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */