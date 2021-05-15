package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {
    public static final By LOGIN_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void logIn(String logIn, String password) {
        driver.findElement(LOGIN_INPUT).sendKeys(logIn);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public LogInPage open() {
        driver.get(BASE_URL);
        return this;
    }
    public boolean isPageOpened() {

    }
}
