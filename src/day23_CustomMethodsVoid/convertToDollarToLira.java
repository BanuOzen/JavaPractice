package day23_CustomMethodsVoid;

public class convertToDollarToLira {
    public static void main(String[] args) {

        dollarToLira(50);

    }
    public static void dollarToLira(double dollar){

        double lira = dollar * 19.25;
        System.out.println("lira = " + lira);

    }

}
/*
9. create a method that can convert dollar to lira
 */