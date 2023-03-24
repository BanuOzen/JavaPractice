package day16_ForLoopAndStringPractices;

public class FrequencyDogAndCat {
    public static void main(String[] args) {
        String sentence = "cat dog cat dog cat dog ";
        int count=0;
        int count1=0;

        for (int i = 0; i <sentence.length()-3 ; i++) {

            String s1 = sentence.substring(i,i+3);

            if(s1.equalsIgnoreCase("cat ")){
                count++;
            }
            if(s1.equalsIgnoreCase("dog ")){
                count1++;
            }

        }

        boolean result= count==count1;
        System.out.println(result);


    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear
the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true


 */