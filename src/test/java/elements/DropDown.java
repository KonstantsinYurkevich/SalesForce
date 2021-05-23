package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;
    String locator;
    String optionLocator;


    public DropDown(WebDriver driver, String label, String page) {
        if (page.equals("Account")) {
            locator = "//*[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//a";
            optionLocator = "//*[contains(@class,'uiMenuList') and contains(@class,'visible')]//a[@title='%s']";
        } else {
            locator = "//*[contains(@class,'modal-body')]//label[text()='Salutation']/ancestor::lightning-combobox[contains(@class,'slds-form-element')]//lightning-base-combobox//input";
            optionLocator = "//div[contains(@class,'slds-dropdown-trigger_click')]//span[@title = '%s']";
        }
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}