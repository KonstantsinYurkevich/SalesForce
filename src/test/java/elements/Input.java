package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String inputLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']//ancestor::div[contains(@class, 'uiInput')]//input";
    String inputAreaLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']//ancestor::div[contains(@class," +
            " 'uiInput')]//textarea";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;

    }

    public void writeIn(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys(text);
    }

    public void writeInArea(String text) {
        driver.findElement(By.xpath(String.format(inputAreaLocator, label))).sendKeys(text);
    }
}
