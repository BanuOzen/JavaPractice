package day09_IfStatement;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = 'b';
        String result="";
        if(ch>='A'&& ch<='Z' || ch>='a'&& ch<='z'){
            result="Alphabetic Character";
        }else{
            result="Special Character";
        }
        System.out.println(result);


    }
}
/*
4. Create a class called Character Identity, and write a program that can identify if the given character
 is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */