package day39_RecapEncapsulation_Inheritance.animal;

public class FriendlyAnimal extends  Animal{
    public static boolean isWild = false,
     isFriendly = true,
     isPlayable = true;

    public FriendlyAnimal(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }
    public void pet(){
        System.out.println(getName() + " likes being petted");
    }
}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */