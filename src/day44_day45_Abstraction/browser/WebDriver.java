package day44_day45_Abstraction.browser;

public interface WebDriver extends SearchContext {
    String url = "";
    void get(String url);
    void close();
    void quit();
    void getTitle();
}
