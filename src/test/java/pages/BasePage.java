package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public static  String BASE_URL = "https://qa10tms.lightning.force.com/";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, 20);
    }
    public abstract boolean IsPageOpeneed ();
    public  boolean isExist(By locator) {
        try{
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception){
            return false;
        }
    }
}
