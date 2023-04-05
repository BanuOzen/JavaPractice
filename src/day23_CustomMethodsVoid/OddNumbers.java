package day23_CustomMethodsVoid;

public class OddNumbers {
    public static void main(String[] args) {

        oddNumberArrays();




    }
    public static void oddNumberArrays(){

       int number = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i % 2 ==1){
                System.out.print(i + " ");
            }

        }
        System.out.println();



    }
}
