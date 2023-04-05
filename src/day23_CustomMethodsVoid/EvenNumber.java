package day23_CustomMethodsVoid;

public class EvenNumber {
    public static void main(String[] args) {
        evenNumber();

    }
    public static void evenNumber(){
        for (int i = 1; i <=100 ; i++) {
            if(i % 2 ==0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println();



    }

}
