package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandiesTest {
    public static void main(String[] args) {

        ArrayList<Candies> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(

        new Candies("M&M", 60, 1.5, false),
        new Candies("M&M", 50,0.5,false),
        new Candies("M&M", 40,2.5,false),
        new Candies("M&M", 30,3.5,false),
        new Candies("M&M", 20,2.75,false)

        ));


        for (Candies candy : candies){
            System.out.println(candy.getBrand() + " : " + candy.getPrice());
        }

    }
}
