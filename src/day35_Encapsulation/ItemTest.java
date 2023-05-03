package day35_Encapsulation;

public class ItemTest {
    public static void main(String[] args) {

        Item item = new Item("Apple", 0.5, 20);
        System.out.println(item);


        item.setName("toilet Paper");

        item.setQuantity(2);

        System.out.println(item);

    }
}
