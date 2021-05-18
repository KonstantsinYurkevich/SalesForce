package pages;


import elements.DropDown;
import elements.Dropdown;
import elements.Input;
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

    public AccountDetailsPage create(Account account) {
        new Input(driver, "Account Name").writeIn(account.getAccountName());
        new DropDown(driver,"Type").select("Press");
        new Input(driver, "Website").writeIn(account.getWebsite());
        new Input(driver, "Phone").writeIn(account.getPhone());
        new Input(driver, "Description").writeInArea(account.getDescription());
        new DropDown(driver,"Industry").select("Media");
        new Input(driver, "Employees").writeIn(account.getEmployees());
        new Input(driver, "Billing Street").writeInArea(account.getBilling_Street());
        new Input(driver, "Billing City").writeIn(account.getBilling_city());
        new Input(driver, "Billing State/Province").writeIn(account.getBilling_state_province());
        new Input(driver, "Billing Zip/Postal Code").writeIn(account.getBilling_zip_postal_code());
        new Input(driver, "Billing Country").writeIn(account.getBilling_country());
        new Input(driver, "Shipping Street").writeInArea(account.getShipping_street());
        new Input(driver, "Shipping City").writeIn(account.getShipping_city());
        new Input(driver, "Shipping State/Province").writeIn(account.getShipping_state_province());
        new Input(driver, "Shipping Zip/Postal Code").writeIn(account.getShipping_zip_postal_code());
        new Input(driver, "Shipping Country").writeIn(account.getShipping_country());
        save();

        return new AccountDetailsPage(driver);


    }


    public void save() {
        driver.findElement(BUTTON_SAVE).click();
    }


}
