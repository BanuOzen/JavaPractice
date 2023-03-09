package day08_SingleIfStatement;

public class Eligible {
    public static void main(String[] args) {
        byte age = 15;
        if(age>=18){
            System.out.println(age + " is eligible to buy cigarettes");
        }
        if(age<18){
            System.out.println(age + " is not eligible to buy cigarettes");
        }
    }
}
/*
1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */