package day14_String;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");

        String word=scan.next();
        scan.close();

        char firstCh=word.charAt(0);


        if(firstCh>='0'&& firstCh<='9'){
            System.out.println("First Character is digit");
        }else if(firstCh>='a' && firstCh<='z'){
            System.out.println("First character is lower case");
        }else if(firstCh>='A' && firstCh<='Z'){
            System.out.println("First character is upper case");
        }else{
            System.out.println("First character is special character");
        }




    }
}
/*
5. Ask user to enter a word,
      if the word starts with digits, print "first character is digit"
      if the word starts with uppercase letters, print "first character
      is lowercase letter"
      if the word starts with lowercase letters, print "first character
      is uppercase letter"
      if the word starts with special characters, print "first character
       is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table

 */