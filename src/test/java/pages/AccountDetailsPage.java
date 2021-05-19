package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return false;
    }


    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
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
