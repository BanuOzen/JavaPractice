package day33_Statics;

public class IphoneTest {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("iphone 12", "Black", 1000, "5.6 inches");

        System.out.println(iphone);

        iphone.faceTime(123456789);
        iphone.faceTime("gmail@yahoo.com");
        iphone.call(123456789);
        iphone.text(123456789);


    }
}
