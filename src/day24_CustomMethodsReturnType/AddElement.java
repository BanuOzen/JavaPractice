package day24_CustomMethodsReturnType;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        array=addElement(array,5);
        System.out.println(Arrays.toString(array));
    }
    public static int[] addElement(int[] arr, int elem) {
        int[] result = new int[arr.length+1];
        int j;

        for ( j = 0; j < arr.length; j++) {
            result[j] = arr[j];
        }
        System.out.println("j= "+j);
        result[j]=elem;
        return result;
    }





}
/*
   6. create a method named addElement that takes one integer array and one integer,
    the method can add the Integer number after the  last index
    of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */