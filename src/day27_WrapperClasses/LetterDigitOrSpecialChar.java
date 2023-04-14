package day27_WrapperClasses;

public class LetterDigitOrSpecialChar {

    public static void main(String[] args) {
        String str = "Wooden1 Spoon!2";
        String letter = "";
        String digit = "";
        String specialChar = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(Character.isLetter(each)){
                letter +=each;
            }else if(Character.isDigit(each)){
                digit +=each;
            }else{
                specialChar +=each;
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("specialChar = " + specialChar);




    }

}

/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */