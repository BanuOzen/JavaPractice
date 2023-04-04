package day21_ForEachLoop;

import java.util.Arrays;

public class ReturnCount {
    public static void main(String[] args) {
        String sentence = "Java is java . Java programming  java language. Python is very good. Python is hard";
       String[] words = sentence.split(" ");

       int countJava = 0;
       int countPython = 0;
        for (String each : words) {
            if(each.equalsIgnoreCase("java")){
                countJava++;

            }else if(each.equalsIgnoreCase("python")){
                countPython++;
            }

        }
        System.out.println(countJava + " Java and " + countPython + " Python");

    }
}
/*6. Write a program that can return the number of appearances of
“java” and “python” anywhere in the sentence.
	(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)


 */