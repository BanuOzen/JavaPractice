package day44_day45_Abstraction.browser;

public class DriverObjects {
    public static void main(String[] args) {
        SafariDriver safari = new SafariDriver("Safari");
        System.out.println(safari);
        safari.get("sd343");
        safari.findElement("d");
        safari.getTitle();




    }
}
