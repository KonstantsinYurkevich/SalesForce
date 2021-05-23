package pages;

import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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


    public NewContactDetailsPage openDetailsTab() {
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

    public void validateContact(Contact contact) {
        validateName("Name",   contact.getFirst_name() +
                " " + contact.getLast_name() + " " + contact.getMiddle_name() + " " + contact.getSuffix());
       // validateAccountName("Account Name", contact.getAccountName());
        validateInput("Title", contact.getTitle());
        validateEmail("Email", contact.getEmail());
        validatePhone("Phone", contact.getPhone());
        validatePhone("Mobile", contact.getMobile());
        validateInput("Department", contact.getDepartment());
        validatePhone("Fax", contact.getFax());
        validateAddress("Mailing Address", contact.getMailing_street() +
                contact.getMailing_city() + ", " + contact.getMailing_state_province() + " " +
                contact.getMailing_zip_postal_code() + contact.getMailing_country());

    }
}