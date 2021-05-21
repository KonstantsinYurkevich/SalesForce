package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import pages.AccountsPage;
import pages.LogInPage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    WebDriver driver;
    protected LogInPage logInPage;
    protected AccountsPage accountsPage;


    public static final String LOGIN = "kutcevolov-ahth@force.com";
    public static final String PASSWORD = "3345183Kostya";

    @BeforeMethod
    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {
        if (browser.equals("chrome")) {
            Map<String, Object> prefs = new HashMap<>();
            ChromeOptions options = new ChromeOptions();
            prefs.put("profile.default_content_setting_values.notifications", 2);
            options.setExperimentalOption("prefs", prefs);
            WebDriverManager.chromedriver().setup();
            options.addArguments("--no-sandbox");
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--no-sandbox");
            options.addPreference("disable_beforeunload",false);
            driver = new FirefoxDriver(options);
            driver.manage().window().maximize();
        }
        testContext.setAttribute("driver", driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        logInPage = new LogInPage(driver);
        accountsPage = new AccountsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}