package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
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
            inputArea = "//*[contains(@class,'modal-body')]//*[text()='%s']//ancestor::div[contains(@class," +
                    "'slds-form-element')]//textarea";
        }
        this.driver = driver;
        this.label = label;
    }


    public void writeIn(String text) {
        try {
            driver.findElement(By.xpath(String.format(input, label))).sendKeys(text);
        } catch (Exception exception) {
            log.fatal(exception.getMessage());
        }
    }

    public void clean() {

        try {
            driver.findElement(By.xpath(String.format(input, label))).clear();
        } catch (Exception exception) {
            log.fatal(exception);
        }
    }

    public void writeInArea(String text) {
        try {
            driver.findElement(By.xpath(String.format(inputArea, label))).sendKeys(text);
        } catch (Exception exception) {
            log.fatal(exception);
        }
    }

}
