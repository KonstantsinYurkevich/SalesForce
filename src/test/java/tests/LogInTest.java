package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    @Test
    public void logIn() {
        logInPage.open();
        logInPage.logIn(LOGIN, PASSWORD);
        boolean isDisplayed = driver.findElement(By.cssSelector("[title='Sales']")).isDisplayed();
        Assert.assertTrue(isDisplayed, "Page not load");
    }
}
