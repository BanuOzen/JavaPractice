package day23_CustomMethodsVoid;



public class PrintEachElement {
    public static void main(String[] args) {
        int[] a = { 6,7,8,9};
        eachElementArray(a);

    }
    public static void eachElementArray(int[] num){

        for (int number : num) {
            System.out.println(number);
        }


    }
}
/*

 */