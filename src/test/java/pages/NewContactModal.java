package pages;

import elements.DropDown;
import elements.Input;
import elements.Search;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class NewContactModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Account']");

    public static final By BUTTON_SAVE = By.xpath("//button[contains(@name,'SaveEdit')]");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(MODAL_TITLE);

    }

    @Step("Fill in form of new contact according test data ")
    public NewContactDetailsPage create(Contact contact) {
        log.info("Fill in form of new contact on new contact page");
        new Input(driver, "First Name", "Contact").writeIn(contact.getFirst_name());
        new Input(driver, "Middle Name", "Contact").writeIn(contact.getMiddle_name());
        new Input(driver, "Last Name", "Contact").writeIn(contact.getLast_name());
        new Input(driver, "Suffix", "Contact").writeIn(contact.getSuffix());
        new DropDown(driver, "Salutation", "Contact").select(contact.getDropdown_salutation());
        new Search(driver, "Account Name", "Contact").option(contact.getAccountName());
        new Input(driver, "Title", "Contact").writeIn(contact.getTitle());
        new Input(driver, "Email", "Contact").writeIn(contact.getEmail());
        new Input(driver, "Phone", "Contact").writeIn(contact.getPhone());
        new Input(driver, "Mobile", "Contact").writeIn(contact.getMobile());
        new Input(driver, "Department", "Contact").writeIn(contact.getDepartment());
        new Input(driver, "Fax", "Contact").writeIn(contact.getFax());
        new Input(driver, "Mailing Street", "Contact").writeInArea(contact.getMailing_street());
        new Input(driver, "Mailing City", "Contact").writeIn(contact.getMailing_city());
        new Input(driver, "Mailing State/Province", "Contact").writeIn(contact.getMailing_state_province());
        new Input(driver, "Mailing Zip/Postal Code", "Contact").writeIn(contact.getMailing_zip_postal_code());
        new Input(driver, "Mailing Country", "Contact").writeIn(contact.getMailing_country());

        save();

        return new NewContactDetailsPage(driver);

    }

    public void save() {
        driver.findElement(BUTTON_SAVE).click();
    }

}
