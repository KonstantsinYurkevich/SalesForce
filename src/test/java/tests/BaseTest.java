package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountsPage;
import pages.HomePage;
import pages.LogInPage;
import pages.NewAccountPage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    WebDriver driver;
    LogInPage logInPage;
    AccountsPage accountsPage;
    NewAccountPage newAccountPage;

    public static final String LOGIN = "kutcevolov-ahth@force.com";
    public static final String PASSWORD = "3345183Kostya";

    @BeforeMethod
    public void setUp() {
        Map<String,Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--no-sandbox");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        logInPage = new LogInPage(driver);
        accountsPage = new AccountsPage(driver);
        newAccountPage = new NewAccountPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}