package day44_Abstraction.device;

public class DeviceShop {
    public static void main(String[] args) {
        Computer computer = new Computer("Apple", "MAC3", 30000, "gray", "medium",true, true);
        System.out.println(computer);
        computer.laptop();
        computer.turnOn();
        computer.turnOff();
        computer.download();

        Samsung samsung = new Samsung("Samsung","S20", 40000,"blue","small", true, false, 1234567897);
        System.out.println(samsung);


    }
}
