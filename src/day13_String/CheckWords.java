package day13_String;

public class CheckWords {
    public static void main(String[] args) {

        String str1= "Hello Cydeo";
        String str2 = "Hello Java";
        String str3 = "Hello Intellij";


        int str1Len = str1.length();
        int str2Len = str2.length();
        int str3Len = str3.length();

        String result="";
        if(str1Len==str2Len && str1Len==str3Len){
            result="All words are same length";
        }else if(str1Len== str2Len || str1Len==str3Len){
            result="Not same nor different lengths";
        }else{
            result="All different length";
        }
        System.out.println(result);


    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"


 */