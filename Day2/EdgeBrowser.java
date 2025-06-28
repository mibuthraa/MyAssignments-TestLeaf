package Week1.Day2;

public class EdgeBrowser {

    public static void main(String[] args) {
        // Creating object for Browser class
        Browser browser = new Browser();

        // Calling Browser class methods
        String browserName = browser.launchBrowser("Edge");
        System.out.println("Launched Browser: " + browserName);

        browser.loadUrl();
    }
}