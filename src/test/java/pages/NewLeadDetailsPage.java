package pages;

import io.qameta.allure.Step;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewLeadDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");
    public static final By ACTIVE_DETAILS_TAB = By.xpath("//a[contains(text(),'Details')]//ancestor::li[contains" +
            "(@class,'slds-is-active')]");

    public NewLeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return true;
    }

    @Step("Open details tab on lead page")
    public NewLeadDetailsPage openDetailsTab() {
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

    @Step("Validating lead from data and lead from site")
    public void validateLead(Lead lead) {
        validateInput("Lead Status", lead.getDropdown_lead_status());
        validateName("Name", lead.getDropdown_salutation() + " " + lead.getFirst_name() + " " +
                lead.getMiddle_name() + " " + lead.getLast_name() + " " + lead.getSuffix());
        validateInput("Title", lead.getTitle());
        validateEmail("Email", lead.getEmail());
        validatePhone("Phone", lead.getPhone());
        validatePhone("Mobile", lead.getMobile());
        //validateInput("Rating", lead.getDropdown_rating());
        validateURL("Website", lead.getWebsite());
        validateInput("Company", lead.getCompany());
        validateInput("Industry", lead.getDropdown_industry());
        validateEmployees("No. of Employees", lead.getNo_of_Employees());
        validateInput("Lead Source", lead.getDropdown_lead_source());
        validateCityProvinceZipCode("Address", lead.getCity() + ", " + lead.getState_province() + " " +
                lead.getZip_postal_code());
        validateCountry("Address", lead.getCountry());
        validateStreet("Address", lead.getStreet());

    }
}
