package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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


    public NewAccountDetailsPage openDetailsTab() {
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

    public void validateAccount(Account account) {
        validateInput("Account Name", account.getAccountName());
        validateInput("Type", account.getDropdown_type());
        validateURL("Website", account.getWebsite());
        validatePhone("Phone", account.getPhone());
        validateInput("Description", account.getDescription());
        validateInput("Industry", account.getDropdown_industry());
        validateEmployees("Employees", account.getEmployees());
        validateBillingAddressStreet("Billing Address", account.getBilling_Street());
        validateBillingAddressCityProvinceZipCode("Billing Address", account.getBilling_city() + ", "
                + account.getBilling_state_province() + " " + account.getBilling_zip_postal_code());
        validateBillingAddressCountry("Billing Address", account.getBilling_country());
        validateShippingAddressStreet("Shipping Address", account.getShipping_street());
        validateShippingAddressCityProvinceZipCode("Shipping Address", account.getShipping_city() + ", "
                + account.getShipping_state_province() + " " + account.getShipping_zip_postal_code());
        validateShippingAddressCountry("Shipping Address", account.getShipping_country());

    }
}
