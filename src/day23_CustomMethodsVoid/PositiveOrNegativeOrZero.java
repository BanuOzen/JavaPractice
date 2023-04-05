package day23_CustomMethodsVoid;

public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        integerPositiveOrNegativeOrZero(4);
    }
    public static void integerPositiveOrNegativeOrZero(int integer){
        if(integer>0){
            System.out.println(integer + " is positive");
        }else if(integer<0){
            System.out.println(integer + " is negative");
        }else{
            System.out.println(integer + " is zero");
        }

    }
}
/*
12. create a method that can if the given integer is positive, negative or zero
 */