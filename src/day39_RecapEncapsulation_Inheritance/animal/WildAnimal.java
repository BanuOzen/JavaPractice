package day39_RecapEncapsulation_Inheritance.animal;

public class WildAnimal extends Animal{

    public static boolean isWild=true,
    isFriendly = false,
    isPlayable = false;

    public WildAnimal(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }
    public void hunt(){
        System.out.println(getName() + " is hunting");
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */