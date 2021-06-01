package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class Search {
    WebDriver driver;
    String label;
    String locator;
    String optionLocator;
    WebDriverWait wait;

    public Search(WebDriver driver, String label, String page) {
        if (page.equals("Account")) {
            locator = "//*[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//a";
            optionLocator = "//*[contains(@class,'uiMenuList') and contains(@class,'visible')]//a[@title='%s']";
        } else {
            locator = "//*[contains(@class,'modal-body')]//label[text()='Account Name']/ancestor::lightning-grouped-" +
                    "combobox[contains(@class,'slds-form-element')]//lightning-base-combobox//input";
            optionLocator = "//*[contains(@class,'modal-body')]//div[contains(@class,'slds-dropdown')]//lightning-base-combobox-item//span[contains(@title,'Test')]";
        }
        this.driver = driver;
        this.label = label;
    }

    public void option(String option) {
        try {
            driver.findElement(By.xpath(String.format(locator, label))).click();
            wait = new WebDriverWait(driver, 2);
            driver.findElement(By.xpath(String.format(optionLocator, option))).click();
        } catch (Exception exception) {
            log.fatal(exception.getCause());
        }
    }
}
