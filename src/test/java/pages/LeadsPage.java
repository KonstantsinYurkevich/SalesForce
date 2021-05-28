package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsPage extends BasePage {
    By icon = By.cssSelector("img[title=Lead]");
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final String Leads = "lightning/o/Lead/list?filterName=Recent";

    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open leads page")
    public LeadsPage open() {
        driver.get(BASE_URL + Leads);
        return this;
    }

    @Step("Click on button new on Leads page")
    public NewLeadModal clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return new NewLeadModal(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(icon);
    }
}
