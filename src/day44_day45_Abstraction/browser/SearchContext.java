package day44_day45_Abstraction.browser;

public interface SearchContext {
    String locator = "";
    void findElement(String locator);
    void findElements(String locator);
}
