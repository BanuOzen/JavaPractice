package day13_String;

import java.util.Scanner;

public class FirstAndLastChar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String first=scan.nextLine();



        char f=first.charAt(0);
        char l=first.charAt(first. length()-1);

        String ch= "" + f +"." + l;

        System.out.println("ch = " + ch);

        scan.close();



    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */