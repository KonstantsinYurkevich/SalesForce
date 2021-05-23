package pages;

import elements.DropDown;
import elements.Input;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Account']");

    public static final By BUTTON_SAVE = By.cssSelector("[title=Save]");

    public NewContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(MODAL_TITLE);

    }

    public NewContactDetailsPage create(Contact contact) {
        new Input(driver, "First Name", "Contact").writeIn(contact.getFirst_name());
        new Input(driver, "Middle Name", "Contact").writeIn(contact.getFirst_name());
        new Input(driver, "Last Name", "Contact").writeIn(contact.getFirst_name());
        new Input(driver, "Suffix", "Contact").writeIn(contact.getSuffix());
        // new Input(driver, "AccountName", "Contact").writeIn("Test");
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
        new DropDown(driver, "Salutation", "Contact").select(contact.getDropdown_salutation());
        save();
        return new NewContactDetailsPage(driver);

    }

    public void save() {
        driver.findElement(BUTTON_SAVE).click();
    }

}
