package day23_CustomMethodsVoid;

public class PrintEachChar {
    public static void main(String[] args) {
        eachChar("mom");
    }
    public static void eachChar(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + ",");
        }
    }
}
/*
13. create a method named printEachChar that can print each characters of a string
 */