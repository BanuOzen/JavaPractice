package day13_String;

import java.util.Scanner;

public class LongPrintString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter fist sentence:");
        String s1 = scan.nextLine();
        int s1Long= s1.length();


        System.out.println("Enter second sentence:");
        String s2= scan.nextLine();
        int s2Long= s2.length();

        if(s1Long>s2Long){
            System.out.println("First Sentence");
        }else{
            System.out.println("Second Sentence");
        }

        scan.close();


    }
}
/*
2. write a program that asks user to enter two strings,
 and print out the longest string

 */