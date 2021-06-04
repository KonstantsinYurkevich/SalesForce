package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AccountsPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final String ACCOUNTS = "lightning/o/Account/list?filterName=Recent";
    By icon = By.cssSelector("img[title=Accounts]");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Accounts page")
    public AccountsPage open() {
        log.info("Opening Accounts page");
        driver.get(BASE_URL + ACCOUNTS);
        return this;

    }

    @Step("Click on button new on Accounts page")
    public NewAccountModal clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountModal(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(icon);
    }
}
