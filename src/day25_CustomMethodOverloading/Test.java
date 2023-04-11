package day25_CustomMethodOverloading;

import MyUtilities.ArrayMergeUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[] result = ArrayMergeUtility.merge(arr1,arr2);
        System.out.println(Arrays.toString(result));

        System.out.println("****************************");

        double[] arr3 = {1.2,3.4,5.4,6.5};
        double[] arr4 = {4.3,5.4,6.5};
        double[] result2 = ArrayMergeUtility.merge(arr3,arr4);
        System.out.println(Arrays.toString(result2));

        System.out.println("*****************************");

        char[] arr5 = { 'A','B','C','D'};
        char[] arr6 = { 'a','b','c','d'};
        char[] result3 = ArrayMergeUtility.merge(arr5,arr6);
        System.out.println(Arrays.toString(result3));

        System.out.println("******************************");

        String[] arr7 = {"elma","limon","portakal"};
        String[] arr8 = {"apple", "lemon", "orange"};
        String[] result4 = ArrayMergeUtility.merge(arr7,arr8);
        System.out.println(Arrays.toString(result4));



    }


}
