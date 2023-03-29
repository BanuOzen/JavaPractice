package day20_Arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {

        String[] classMates ={"Ayse Bozkurt","Merve Caliskan","Seyma Caliskan","Selim Demirer","Emrullah Muhtar.","Hüseyin Ay","Necibe Tursun",
                "Ahsen Ustabasi","Eyup Kilic","Muhammed Uslu"};

        for (int i = 0; i < classMates.length; i++) {
            String initials = classMates[i].charAt(0) +"." + classMates[i].charAt(classMates[i].indexOf(" ")+1) ;
            System.out.println(initials);
        }



    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */