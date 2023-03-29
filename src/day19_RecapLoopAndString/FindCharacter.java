package day19_RecapLoopAndString;

public class FindCharacter {
    public static void main(String[] args) {

        String str = "aaaaabbcdeefgg";
        int highest = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch==each){
                    count++;
                }
            }
            if(count > highest){
                highest = count;
            }

        }

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                    count++;
                }
            }

            if(count == highest && !result.contains(ch+"")){
                result +=ch;
            }
        }
        System.out.println(result);

    }
}
/*

6.  Write a program that can find the character that has the highest frequency from a string
 */