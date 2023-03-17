package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first= input.next();

        System.out.println("Enter your last name:");
        String last = input.next();
        input.close();

        char f = first.charAt(0);
        char l = last.charAt(0);

        String initials= f +"."+l;

        System.out.println("initials = " + initials);



    }
}
/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output

 */