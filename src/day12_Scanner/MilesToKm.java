package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double milesToKm=1.609;

        System.out.println("Enter miles: ");
        double miles=scan.nextDouble();

        System.out.println(miles + " miles equal to " + (miles*milesToKm) + " kilometers");



    }
}
/*
4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */
