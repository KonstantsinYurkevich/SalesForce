package elements;

import org.openqa.selenium.WebDriver;

public class Dropdown {
    String locator = "//*[contains(@class,'modal-body')]//span[text()='%s']//ancestor::div[contains(@class, 'uiInput')]//a";
    WebDriver driver;
    WebDriver label;

    public Dropdown (WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
}
