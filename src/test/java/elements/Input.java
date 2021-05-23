package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String input;
    String inputArea;

    public Input(WebDriver driver, String label, String page) {
        if ("Account".equals(page)) {
            input = "//*[contains(@class,'modal-body')]//span[text()='%s']//ancestor::div[contains(@class, 'uiInput')]" +
                    "//input";
            inputArea = "//*[contains(@class,'modal-body')]//span[text()='%s']//ancestor::div[contains(@class," +
                    " 'uiInput')]//textarea";
        } else {
            input = "//*[contains(@class,'modal-body')]//*[text()='%s']//ancestor::lightning-input[contains(@class,'" +
                    "slds-form-element')]//input";
            inputArea = "//*[contains(@class,'modal-body')]//*[text()='Mailing Street']//ancestor::div[contains(@class," +
                    "'slds-form-element')]//textarea";
        }
        this.driver = driver;
        this.label = label;

    }

    public void writeIn(String text) {
        driver.findElement(By.xpath(String.format(input, label))).sendKeys(text);
    }

    public void writeInArea(String text) {
        driver.findElement(By.xpath(String.format(inputArea, label))).sendKeys(text);
    }
}
