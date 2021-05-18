package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    By icon = By.cssSelector("img[title=Accounts]");
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final String ACCOUNTS = "lightning/o/Account/list?filterName=Recent";

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage open() {
        driver.get(BASE_URL + ACCOUNTS);
        return this;
    }

    public NewAccountModal clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountModal(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(icon);
    }
}
