package pages;

import elements.DropDown;
import elements.Input;
import io.qameta.allure.Step;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewLeadModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Lead']");

    public static final By BUTTON_SAVE = By.xpath("//button[contains(@name,'SaveEdit')]");

    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(MODAL_TITLE);

    }

    @Step("Fill in form of new lead according test data ")
    public NewLeadDetailsPage create(Lead lead) {
        new DropDown(driver, "Lead Status", "Lead").select(lead.getDropdown_lead_status());
        new DropDown(driver, "Salutation", "Lead").select(lead.getDropdown_salutation());
        new Input(driver, "First Name", "Lead").writeIn(lead.getFirst_name());
        new Input(driver, "Middle Name", "Lead").writeIn(lead.getMiddle_name());
        new Input(driver, "Last Name", "Lead").writeIn(lead.getLast_name());
        new Input(driver, "Suffix", "Lead").writeIn(lead.getSuffix());
        new Input(driver, "Title", "Lead").writeIn(lead.getTitle());
        new Input(driver, "Email", "Lead").writeIn(lead.getEmail());
        new Input(driver, "Phone", "Lead").writeIn(lead.getPhone());
        new Input(driver, "Mobile", "Lead").writeIn(lead.getMobile());
        new DropDown(driver, "Rating", "Lead").select(lead.getDropdown_rating());
        new Input(driver, "Website", "Lead").writeIn(lead.getWebsite());
        new Input(driver, "Company", "Lead").writeIn(lead.getCompany());
        new DropDown(driver, "Industry", "Lead").select(lead.getDropdown_industry());
        new Input(driver, "No. of Employees", "Lead").writeIn(lead.getNo_of_Employees());
        new Input(driver, "Street", "Lead").writeInArea(lead.getStreet());
        new DropDown(driver, "Lead Source", "Lead").select(lead.getDropdown_lead_source());
        new Input(driver, "City", "Lead").writeIn(lead.getCity());
        new Input(driver, "State/Province", "Lead").writeIn(lead.getState_province());
        new Input(driver, "Zip/Postal Code", "Lead").writeIn(lead.getZip_postal_code());
        new Input(driver, "Country", "Lead").writeIn(lead.getCountry());


        save();

        return new NewLeadDetailsPage(driver);

    }

    public void save() {
        driver.findElement(BUTTON_SAVE).click();
    }

}
