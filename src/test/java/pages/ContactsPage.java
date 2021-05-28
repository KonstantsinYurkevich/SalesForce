package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage {
    By icon = By.cssSelector("img[title=Contacts]");
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final String CONTACTS = "lightning/o/Contact/list?filterName=Recent";

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Leads page")
    public ContactsPage open() {
        driver.get(BASE_URL + CONTACTS);
        return this;
    }

    @Step("Click on button new on Contacts page")
    public NewContactModal clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return new NewContactModal(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(icon);
    }
}