package day23_CustomMethodsVoid;

public class EligibleBuy {
    public static void main(String[] args) {
    eligibleBuyAlcohol(19);

    }
    public static void eligibleBuyAlcohol(int age){

        if(age>=21){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }


    }
}
