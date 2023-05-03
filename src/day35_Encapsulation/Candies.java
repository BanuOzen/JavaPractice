package day35_Encapsulation;

public class Candies {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;


    public Candies(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand( String brand){
        this.brand = brand;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if(quantity <= 0){
            System.err.println("Invalid quantity: " + quantity);
            System.exit(0);
        }
        this.quantity = quantity;
    }
    public double getPrice(){
        return price;
    }


    public void setPrice(double price){
        if(price < 0){
            System.err.println("Invalid price: " + price);
            System.exit(0);
        }
        this.price = price;
    }

    public boolean isHasPeanuts(){
        return hasPeanuts;

    }
    public void setHasPeanuts(boolean hasPeanuts){
        this.hasPeanuts = hasPeanuts;
    }

    public double calcCost(){
        return quantity * price;
    }

    public String toString() {
        return "Candies{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", unit price=" + ((price==0) ? "Free" : "" + price) +
                ", total price=" + ((calcCost()==0) ? "Free" : "" + calcCost()) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
