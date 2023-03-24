package day16_ForLoopAndStringPractices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FrequencyJava {
    public static void main(String[] args) {
        String str ="hello java java programming java is cool";

        int count =0;

        for (int i = 0; i <= str.length()-4; i++) {
            String s = str.substring(i,i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}


/*
4. write a program that can return the frequency of
 the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create

 */