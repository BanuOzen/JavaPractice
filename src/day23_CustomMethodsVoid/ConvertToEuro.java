package day23_CustomMethodsVoid;

public class ConvertToEuro {
    public static void main(String[] args) {
        dollarToEuro(60);
    }

    public static void dollarToEuro(double dollar){
        double euro = dollar * 0.92;
        System.out.println("euro = " + euro);

    }
}
/*
9. create a method that can convert dollar to euro
 */