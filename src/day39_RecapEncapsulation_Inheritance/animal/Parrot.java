package day39_RecapEncapsulation_Inheritance.animal;

public class Parrot extends FriendlyAnimal {
    public Parrot(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }
    public void fly(){
        System.out.println(getName() + " is flying");
    }
    public void sing(){
        System.out.println(getName() + " is singing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating bird feed");
    }
}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()
 */