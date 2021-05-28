package pages;

import io.qameta.allure.Step;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");
    public static final By ACTIVE_DETAILS_TAB = By.xpath("//a[contains(text(),'Details')]//ancestor::li[contains" +
            "(@class,'slds-is-active')]");

    public NewAccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return true;
    }

    @Step("Open details tab on account page")
    public NewAccountDetailsPage openDetailsTab() {
        wait = new WebDriverWait(driver, 20);
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public boolean isDetailsTabOpened() {
        try {
            driver.findElement(ACTIVE_DETAILS_TAB);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    @Step("Validating account from data and account from site")
    public void validateAccount(Account account) {
        validateInput("Account Name", account.getAccountName());
        validateInput("Type", account.getDropdown_type());
        validateURL("Website", account.getWebsite());
        validatePhone("Phone", account.getPhone());
        validateInput("Description", account.getDescription());
        validateInput("Industry", account.getDropdown_industry());
        validateEmployees("Employees", account.getEmployees());
        validateStreet("Billing Address", account.getBilling_Street());
        validateCityProvinceZipCode("Billing Address", account.getBilling_city() + ", "
                + account.getBilling_state_province() + " " + account.getBilling_zip_postal_code());
        validateCountry("Billing Address", account.getBilling_country());
        validateStreet("Shipping Address", account.getShipping_street());
        validateCityProvinceZipCode("Shipping Address", account.getShipping_city() + ", "
                + account.getShipping_state_province() + " " + account.getShipping_zip_postal_code());
        validateCountry("Shipping Address", account.getShipping_country());

    }
}
