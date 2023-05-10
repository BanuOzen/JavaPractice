package day39_RecapEncapsulation_Inheritance.animal;

public class Dog extends FriendlyAnimal {

    public Dog(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating bone");
    }
    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
/*
1. Dog:
					Extra methods:
						bark()
 */