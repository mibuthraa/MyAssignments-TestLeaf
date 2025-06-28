package Week1.Day2;

public class Browser {

    public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }

    public void loadUrl() {
        System.out.println("Application url loaded successfully");
    }

    public static void main(String[] args) {
        // Creating object for Browser class
        Browser browser = new Browser();

        // Calling methods
        String browserName = browser.launchBrowser("Chrome");
        System.out.println("Launched Browser: " + browserName);

        browser.loadUrl();
    }
}