package day35_Encapsulation;



public class RectangleTest {

    public static void main(String[] args) {

       Rectangle rectangle1 = new Rectangle(2,4);
        System.out.println(rectangle1);
       rectangle1.setWidth(3);
       rectangle1.setLength(6);
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1);



    }
}
