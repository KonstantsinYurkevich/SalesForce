package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class NewContactDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");
    public static final By ACTIVE_DETAILS_TAB = By.xpath("//a[contains(text(),'Details')]//ancestor::li[contains" +
            "(@class,'slds-is-active')]");

    public NewContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return true;
    }

    @Step("Open details tab on contact page")
    public NewContactDetailsPage openDetailsTab() {
        log.info("Opening details tab on contact page");
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

    @Step("Validating contact from data and contact from site")
    public void validateContact(Contact contact) {
        log.info("Validating contact");
        validateName("Name", contact.getDropdown_salutation() + " " + contact.getFirst_name() +
                " " + contact.getMiddle_name() + " " + contact.getLast_name() + " " + contact.getSuffix());
        validateAccountName("Account Name", contact.getAccountName());
        validateInput("Title", contact.getTitle());
        validateEmail("Email", contact.getEmail());
        validatePhone("Phone", contact.getPhone());
        validatePhone("Mobile", contact.getMobile());
        validateInput("Department", contact.getDepartment());
        validatePhone("Fax", contact.getFax());
        validateCityProvinceZipCode("Mailing Address", contact.getMailing_city() + ", " +
                contact.getMailing_state_province() + " " +
                contact.getMailing_zip_postal_code());
        validateCountry("Mailing Address", contact.getMailing_country());
        validateStreet("Mailing Address", contact.getMailing_street());

    }

}