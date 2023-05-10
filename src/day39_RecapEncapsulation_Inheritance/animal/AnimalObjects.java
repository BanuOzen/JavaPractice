package day39_RecapEncapsulation_Inheritance.animal;

public class AnimalObjects {
    public static void main(String[] args) {
        Bear bear = new Bear("Big", "Grizzly bear", 3, 'M', "Large", "white");
        bear.hunt();
        System.out.println(bear);
    }
}
