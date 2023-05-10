package day39_RecapEncapsulation_Inheritance.animal;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }
    public void scratch(){
        System.out.println(getName() + " is scratching");
    }
    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }
}
/*
2. Cat:
					Extra methods:
						scratch()
						meow()
 */