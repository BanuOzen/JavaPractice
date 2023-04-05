package day23_CustomMethodsVoid;

public class KgToLb {
    public static void main(String[] args) {

        convertKgToLb(45);

    }
    public static void convertKgToLb(double kg){
        double lb = kg * 0.453;
        // 1Lb = 0.453kg
        System.out.println(kg + " kg equal to " + lb + " pounds");
    }
}
/*
11. create a method that can convert kg to lb
 */