package day14_String;

import java.util.Scanner;

public class Word1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        String wordLast= word.substring(word.length()-2);


        if(wordLast.equals("ly")){
            System.out.println("really");

        }else{
            System.out.println("Never Mind");
        }




    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
  otherwise, print "never mind"
 */