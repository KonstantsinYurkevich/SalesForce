package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {
    public static final String BASE_URL = "https://qa10tms.lightning.force.com/";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public abstract boolean IsPageOpened();

    public boolean isExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public void validateInput(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//" +
                "lightning-formatted-text";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateURL(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//" +
                "lightning-formatted-url";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateEmployees(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//" +
                "lightning-formatted-number";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validatePhone(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//" +
                "lightning-formatted-phone";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateBillingAddressStreet(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::" +
                "force-record-layout-item//lightning-formatted-address/a/div[1]";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateBillingAddressCityProvinceZipCode(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::" +
                "force-record-layout-item//lightning-formatted-address/a/div[2]";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateBillingAddressCountry(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::" +
                "force-record-layout-item//lightning-formatted-address/a/div[3]";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateShippingAddressStreet(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::" +
                "force-record-layout-item//lightning-formatted-address/a/div[1]";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateShippingAddressCityProvinceZipCode(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::" +
                "force-record-layout-item//lightning-formatted-address/a/div[2]";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateShippingAddressCountry(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::" +
                "force-record-layout-item//lightning-formatted-address/a/div[3]";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateEmail(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//a";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateAccountName(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='Account Name']/ancestor::force-record-layout-item//a/span";
        //div[contains(@class,'active')]//span[text()='Account Name']/ancestor::force-record-layout-item//a/span
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateName(String label, String expected) {
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-name";
        assertEquals(
                driver.findElement(By.xpath(String.format(locator, label))).getText(),
                expected,
                "Input text is not correct"
        );
    }

    public void validateAddress(String label, String expected) {

        String locator = "//div[contains(@class,'active')]//span[text()='Mailing Address']//ancestor::force-record-layout-item//lightning-formatted-address/a";
        String innerText = driver.findElement(By.xpath(String.format(locator, label))).getAttribute("InnerText");
        assertEquals(innerText, expected, "Input text is not correct");
    }
}
