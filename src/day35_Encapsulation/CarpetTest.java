package day35_Encapsulation;

public class CarpetTest {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(2,3,10,false);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setWidth(7);
        carpet.setLength(6);
        System.out.println(carpet);
    }



}
