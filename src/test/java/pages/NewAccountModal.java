package pages;


import elements.DropDown;
import elements.Input;
import io.qameta.allure.Step;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NewAccountModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Account']");

    public static final By BUTTON_SAVE = By.cssSelector("[title=Save]");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("Fill in form of new account according test data ")
    public NewAccountDetailsPage create(Account account) {
        new Input(driver, "Account Name", "Account").writeIn(account.getAccountName());
        new DropDown(driver, "Type", "Account").select(account.getDropdown_type());
        new Input(driver, "Website", "Account").writeIn(account.getWebsite());
        new Input(driver, "Phone", "Account").writeIn(account.getPhone());
        new Input(driver, "Description", "Account").writeInArea(account.getDescription());
        new DropDown(driver, "Industry", "Account").select(account.getDropdown_industry());
        new Input(driver, "Employees", "Account").writeIn(account.getEmployees());
        new Input(driver, "Billing Street", "Account").writeInArea(account.getBilling_Street());
        new Input(driver, "Billing City", "Account").writeIn(account.getBilling_city());
        new Input(driver, "Billing State/Province", "Account").writeIn(account.getBilling_state_province());
        new Input(driver, "Billing Zip/Postal Code", "Account").writeIn(account.getBilling_zip_postal_code());
        new Input(driver, "Billing Country", "Account").writeIn(account.getBilling_country());
        new Input(driver, "Shipping Street", "Account").writeInArea(account.getShipping_street());
        new Input(driver, "Shipping City", "Account").writeIn(account.getShipping_city());
        new Input(driver, "Shipping State/Province", "Account").writeIn(account.getShipping_state_province());
        new Input(driver, "Shipping Zip/Postal Code", "Account").writeIn(account.getShipping_zip_postal_code());
        new Input(driver, "Shipping Country", "Account").writeIn(account.getShipping_country());
        save();

        return new NewAccountDetailsPage(driver);


    }


    public void save() {
        driver.findElement(BUTTON_SAVE).click();
    }


}
