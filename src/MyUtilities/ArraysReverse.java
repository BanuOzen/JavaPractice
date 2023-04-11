package MyUtilities;

public class ArraysReverse {

    public static int[] reverse(int[] array){
        int[] reverseArray = new int[array.length];
        int j=0;
        for (int i = array.length-1 ; i >=0 ; i--) {
            reverseArray[j++]=array[i];
        }
        return reverseArray;
    }
    public static double[] reverse(double[] array){
        double[] reverseArray = new double[array.length];
        int j =0;
        for (int i = array.length-1; i >=0 ; i--) {
            reverseArray[j++]=array[i];
        }
        return reverseArray;
    }
    
    public static char[] reverse(char[] array){
        char[] reverseArray = new char[array.length];
        int j = 0;
        for (int i = array.length-1 ; i >=0 ; i--) {
            reverseArray[j++]=array[i];
        }
        return reverseArray;
    }

    public static String[] reverse(String[] array){
        String[] reverseArray = new String[array.length];
        int j = 0;
        for (int i = array.length-1 ; i >=0 ; i--) {
            reverseArray[j++]=array[i];
        }
        return reverseArray;
    }

}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */