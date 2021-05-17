package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    By SELECTED_IN_NAVIGATION_BAR = By.cssSelector(".slds-breadcrumb >li>span");
    public static final By NEW_BUTTON = By.cssSelector("li >[title='New']");
    public static final String ACCOUNTS = "lightning/o/Account/list?filterName=Recent";

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountPage() {
        driver.get(BASE_URL + ACCOUNTS);
        return this;
    }

    public NewAccountPage newAccountPage() {
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountPage(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(SELECTED_IN_NAVIGATION_BAR);
    }
}
