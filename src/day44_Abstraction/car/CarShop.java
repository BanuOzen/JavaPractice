package day44_Abstraction.car;

import day44_Abstraction.car.Audi;

public class CarShop {
    public static void main(String[] args) {
        Audi audi = new Audi("germany", "A4", 2013, 5000, "White");
        System.out.println(audi);
        audi.start();



    }
}
