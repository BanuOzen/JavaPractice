package day23_CustomMethodsVoid;

public class CalculateAreaCircle {
    public static void main(String[] args) {

        areaOfCircle(4.5);

    }
    public static void areaOfCircle(double radius){
        double area = radius*radius*3.14;
        System.out.println("area = " + area);
    }
}
/*
6. create a method that can calculate the area of a circle
*/