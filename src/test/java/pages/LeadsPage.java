package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LeadsPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    public static final String Leads = "lightning/o/Lead/list?filterName=Recent";
    By icon = By.cssSelector("img[title=Lead]");

    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open leads page")
    public LeadsPage open() {
        log.info("Opening Leads page");
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
