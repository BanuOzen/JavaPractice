package day13_String;

import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String s1 = input.nextLine();
        int s1length = s1.length();

      if(s1length>=0) {

          if(s1length==0){
              System.out.println("String is empty");
          } else if(s1length >= 3) {
              System.out.println(s1.substring((s1length-3)));

          } else if(s1length<3 && s1length>0) {
                  System.out.println(s1);
          }

      }else{
              System.out.println("Invalid");
      }
    }

}















/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself


 */