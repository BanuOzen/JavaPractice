package day24_CustomMethodsReturnType;

public class isPalindrome {
    public static void main(String[] args) {

        String str="Level";

        boolean result = isPalindrome(str);
        System.out.println(result);

    }
    public static boolean isPalindrome(String str){

       return ReverseJava.reverse(str).equalsIgnoreCase(str);

        

    }
}
/*
4. By using the reverse method above to create another method
named isPalindrome  that passes a String parameter,
the method returns true if the string is palindrome,
 otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */
