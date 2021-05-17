package pages;


import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NewAccountPage extends BasePage {
    public static final By TITLE_NEW_ACCOUNT = By.xpath("//h2[text()='New Account']");

    public static final By WEBSITE = By.xpath("//*[contains(text(),'Website')]//ancestor::div/input");
    public static final By ACCOUNT_NAME = By.xpath("//span[text() = 'Account Name']//ancestor::label//following::input[1]");
    public static final By DROPDOWN_TYPE = By.xpath("//span[contains(text(),'Type')]//ancestor::span//following::a[1]");
    public static final By DESCRIPTION = By.xpath("//*[contains(text(),'Description')]//ancestor::div/textarea");
    //public static final By PARENT_ACCOUNT = By.cssSelector("[title='Search Accounts']");
    public static final By PHONE = By.xpath("//span[contains(text(),'Phone')]//ancestor::div/input");
    public static final By DROPDOWN_INDUSTRY = By.xpath("//span[contains(text(),'Industry')]//ancestor::span//following::a[1]");
    public static final By EMPLOYEES = By.xpath("//*[contains(text(),'Employees')]//ancestor::div/input");
    public static final By BILLING_ADDRESS = By.xpath("//*[contains(text(),'Billing Address')]//ancestor::legend//following::button[1]");
    public static final By SHIPPING_ADDRESS = By.xpath("//*[contains(text(),'Shipping Address')]//ancestor::legend//following::button[1]");
    public static final By BILLING_STREET = By.xpath("//span[text()='Billing Street']//ancestor::div/textarea");
    public static final By SHIPPING_STREET = By.xpath("//span[text()='Shipping Street']//ancestor::div/textarea");
    public static final By BILLING_CITY = By.xpath("//span[text()='Billing City']//ancestor::div/input");
    public static final By BILLING_STATE_PROVINCE = By.xpath("//*[contains(text(),'Billing State/Province')]//ancestor::div/input");
    public static final By SHIPPING_CITY = By.xpath(" //span[text()='Shipping City']//ancestor::div/input");
    public static final By SHIPPING_STATE_PROVINCE = By.xpath("//*[contains(text(),'Shipping State/Province')]//ancestor::div/input");
    public static final By BILLING_ZIP_POSTAL_CODE = By.xpath(" //*[contains(text(),'Billing Zip/Postal Code')]//ancestor::div/input");
    public static final By BILLING_COUNTRY = By.xpath("//*[contains(text(),'Billing Country')]//ancestor::div/input");
    public static final By SHIPPING_ZIP_POSTAL_CODE = By.xpath("//*[contains(text(),'Shipping Zip/Postal Code')]//ancestor::div/input");
    public static final By SHIPPING_COUNTRY = By.xpath("//*[contains(text(),'Shipping Country')]//ancestor::div/input");

    public static final By BUTTON_SAVE = By.cssSelector("[title=Save]");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return isExist(TITLE_NEW_ACCOUNT);

    }

    public AccountsPage createNewAccount() {
        driver.findElement(ACCOUNT_NAME).sendKeys("Lalalala");

        driver.findElement(DROPDOWN_TYPE).click();
        driver.findElement(By.xpath("//*[contains(text(),'Analyst')]")).click();

        driver.findElement(WEBSITE).sendKeys("www.lololo.com");

        driver.findElement(DESCRIPTION).sendKeys("Description");

        //driver.findElement(PARENT_ACCOUNT).sendKeys("sdasdasd");

        driver.findElement(PHONE).sendKeys("007");

        driver.findElement(DROPDOWN_INDUSTRY).click();
        driver.findElement(By.xpath("//*[contains(text(),'Chemicals')]")).click();


        driver.findElement(EMPLOYEES).sendKeys("123");


        driver.findElement(BILLING_ADDRESS).click();
        WebElement elementTExt = driver.findElement(By.cssSelector("[placeholder='Enter address']"));
        Actions actions = new Actions(driver);
        actions
                .sendKeys(elementTExt, "Russia")
                .build()
                .perform();
        driver.findElement(By.xpath("//span[contains(text(),'Russia')]//ancestor::ul/li[1]/a")).click();


        driver.findElement(SHIPPING_ADDRESS).click();
        WebElement elementTEXT = driver.findElement(By.cssSelector("[placeholder='Enter address']"));
        Actions action2 = new Actions(driver);
        action2
                .sendKeys(elementTEXT, "China")
                .build()
                .perform();
        driver.findElement(By.xpath("//span[contains(text(),'China')]//ancestor::ul/li[1]/a")).click();

        driver.findElement(BILLING_STREET).sendKeys("qweqweqweq");

        driver.findElement(SHIPPING_STREET).sendKeys("sdasdasd");

        driver.findElement(BILLING_CITY).sendKeys("sdasdasdsa");

        driver.findElement(BILLING_STATE_PROVINCE).sendKeys("QWeqweq");

        driver.findElement(SHIPPING_CITY).sendKeys("asdasdasd");

        driver.findElement(SHIPPING_STATE_PROVINCE).sendKeys("sadasd");

        driver.findElement(BILLING_ZIP_POSTAL_CODE).sendKeys("asdasdasd");

        driver.findElement(BILLING_COUNTRY).sendKeys("asdasdsadadasdasd");

        driver.findElement(SHIPPING_ZIP_POSTAL_CODE).sendKeys("asdasdasdasdas");

        driver.findElement(SHIPPING_COUNTRY).sendKeys("ASdasdasdasdasd");

        driver.findElement(BUTTON_SAVE).click();


        return new AccountsPage(driver);


    }
    public boolean AccountIsCreated() {
        boolean isCreated;
        try {
            driver.findElement(By.cssSelector("[title=\"Lalalala\"]"));
            isCreated = true;
        } catch (NoSuchElementException exception){
            isCreated = false;
        }
        return isCreated;
    }
    public void create(Account account) {
        new Input(driver, "Account Name").writeIn(account.getAccountName());
        new Input(driver, "Phone").writeIn(account.getPhone());
        new Input(driver, "Website").writeIn(account.getWebsite());
        new Input(driver, "Employees").writeIn(phone);
        new Input(driver, "Billing City").writeIn(phone);
        new Input(driver, "Shipping City").writeIn(phone);
        new Input(driver, "Billing Country").writeIn(phone);
        new Input(driver, "Shipping Country").writeIn(phone);
        new Input(driver, "Billing Zip/Postal Code").writeIn(phone);
        new Input(driver, "Shipping Zip/Postal Code").writeIn(phone);
        new Input(driver, "Billing State/Province").writeIn(phone);
        new Input(driver, "Shipping State/Province").writeIn(phone);
    }

}
