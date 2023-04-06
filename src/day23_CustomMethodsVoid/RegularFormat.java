package day23_CustomMethodsVoid;


public class RegularFormat {
    public static void main(String[] args) {

        regularFormat("bEtuL","BaHAr");

    }

    public static void regularFormat(String firstName, String lastName){

        String firstChar = firstName.toUpperCase().substring(0,1);
        String firstWord = firstName.toLowerCase().substring(1,firstName.length());

        String lastChar = lastName.toUpperCase().substring(0,1);
        String lastWord = lastName.toLowerCase().substring(1,lastName.length());

        System.out.println(firstChar + firstWord + " " + lastChar + lastWord);
    }
}
/*
16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */