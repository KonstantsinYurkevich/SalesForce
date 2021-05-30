package pages;

import elements.DropDown;
import elements.Input;
import io.qameta.allure.Step;
import models.Lead;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class NewLeadDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");
    public static final By ACTIVE_DETAILS_TAB = By.xpath("//a[contains(text(),'Details')]//ancestor::li[contains" +
            "(@class,'slds-is-active')]");

    public static final By BUTTON_CONVERT = By.xpath("//div[contains(@class,'modal-footer')]//button[contains" +
            "(@class,'uiButton--brand')]");
    public static final By BUTTON_SAVE = By.xpath("//div[contains(@class,'modal-body')]//div[contains(@class," +
            "'inlineFooter')]//button[contains(@title,'Save')]");
    public static final By BUTTON_STATUS_COMPLETE = By.xpath(" //div[contains(@class,'slds-card')]//button[contains" +
            "(@class,'slds-path__mark-complete')]");
    public static final By BUTTON_EDIT = By.xpath("//div[contains(@class,'active')]//section[contains(@class," +
            "'slds-path__keys')]//a[contains(@title,'Edit Key Fields')]/p");
    String convertLocator = "//div[contains(@class,'modal-body')]//div[contains(@class,'title')]//span[contains(@class," +
            "'uiOutputText')]";

    public NewLeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean IsPageOpened() {
        return true;
    }

    @Step("Open details tab on lead page")
    public NewLeadDetailsPage openDetailsTab() {
        wait = new WebDriverWait(driver, 20);
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public boolean isDetailsTabOpened() {
        try {
            driver.findElement(ACTIVE_DETAILS_TAB);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    @Step("Validating lead from data and lead from site")
    public void validateLead(Lead lead) {
        validateInput("Lead Status", lead.getDropdown_lead_status());
        validateName("Name", lead.getDropdown_salutation() + " " + lead.getFirst_name() + " " +
                lead.getMiddle_name() + " " + lead.getLast_name() + " " + lead.getSuffix());
        validateInput("Title", lead.getTitle());
        validateEmail("Email", lead.getEmail());
        validatePhone("Phone", lead.getPhone());
        validatePhone("Mobile", lead.getMobile());
        validateInput("Rating", lead.getDropdown_rating());
        validateURL("Website", lead.getWebsite());
        validateInput("Company", lead.getCompany());
        validateInput("Industry", lead.getDropdown_industry());
        validateEmployees("No. of Employees", lead.getNo_of_Employees());
        validateInput("Lead Source", lead.getDropdown_lead_source());
        validateCityProvinceZipCode("Address", lead.getCity() + ", " + lead.getState_province() + " " +
                lead.getZip_postal_code());
        validateCountry("Address", lead.getCountry());
        validateStreet("Address", lead.getStreet());

    }

    public void editLeadToStatusComplete(String LeadStatus) throws InterruptedException {
        switch (LeadStatus) {
            case ("Unqualified"):

                edit();
                new DropDown(driver, "Lead Status", "Account").select("External Referral");
                save();
                complete();
                TimeUnit.SECONDS.sleep(4);

                edit();
                new Input(driver, "Company", "Account").clean();
                new Input(driver, "Company", "Account").writeIn("Onliner Belarus");
                new Input(driver, "Website", "Account").clean();
                new Input(driver, "Website", "Account").writeIn("Onliner.by");
                new DropDown(driver, "Industry", "Account").select("Chemicals");
                new Input(driver, "No. of Employees", "Account").clean();
                new Input(driver, "No. of Employees", "Account").writeIn("123");
                save();
                complete();
                TimeUnit.SECONDS.sleep(4);

                edit();
                new Input(driver, "Title", "Account").clean();
                new Input(driver, "Title", "Account").writeIn("New title edited");
                new Input(driver, "Email", "Account").clean();
                new Input(driver, "Email", "Account").writeIn("new@email.com");
                new Input(driver, "Phone", "Account").clean();
                new Input(driver, "Phone", "Account").writeIn("111111");
                save();
                complete();
                TimeUnit.SECONDS.sleep(4);

                edit();
                new DropDown(driver, "Rating", "Account").select("Warm");
                save();
                complete();
                TimeUnit.SECONDS.sleep(4);

                convert();
                TimeUnit.SECONDS.sleep(4);
                String convertMassage = driver.findElement(By.xpath(convertLocator)).getText();
                Assert.assertEquals(convertMassage, "Your lead has been converted", "Lead doesn't convert");
                break;
            case ("New"):
                edit();
                new Input(driver, "Company", "Account").clean();
                new Input(driver, "Company", "Account").writeIn("Onliner Belarus");
                new Input(driver, "Website", "Account").clean();
                new Input(driver, "Website", "Account").writeIn("Onliner.by");
                new DropDown(driver, "Industry", "Account").select("Chemicals");
                new Input(driver, "No. of Employees", "Account").clean();
                new Input(driver, "No. of Employees", "Account").writeIn("123");
                save();
                complete();
                TimeUnit.SECONDS.sleep(6);

                edit();
                new Input(driver, "Title", "Account").clean();
                new Input(driver, "Title", "Account").writeIn("New title edited");
                new Input(driver, "Email", "Account").clean();
                new Input(driver, "Email", "Account").writeIn("new@email.com");
                new Input(driver, "Phone", "Account").clean();
                new Input(driver, "Phone", "Account").writeIn("88005553535");
                save();
                complete();
                TimeUnit.SECONDS.sleep(6);

                edit();
                new DropDown(driver, "Rating", "Account").select("Warm");
                save();
                complete();
                TimeUnit.SECONDS.sleep(6);

                convert();
                TimeUnit.SECONDS.sleep(6);
                convertMassage = driver.findElement(By.xpath(convertLocator)).getText();
                Assert.assertEquals(convertMassage, "Your lead has been converted", "Lead doesn't convert");
                break;
            case ("Working"):
                edit();
                new Input(driver, "Title", "Account").clean();
                new Input(driver, "Title", "Account").writeIn("New title edited");
                new Input(driver, "Email", "Account").clean();
                new Input(driver, "Email", "Account").writeIn("new@email.com");
                new Input(driver, "Phone", "Account").clean();
                new Input(driver, "Phone", "Account").writeIn("qweqweqweqweqw");
                TimeUnit.SECONDS.sleep(4);

                save();
                complete();
                TimeUnit.SECONDS.sleep(4);

                edit();
                new DropDown(driver, "Rating", "Account").select("Warm");
                save();
                complete();
                TimeUnit.SECONDS.sleep(4);

                convert();
                TimeUnit.SECONDS.sleep(4);
                convertMassage = driver.findElement(By.xpath(convertLocator)).getText();
                Assert.assertEquals(convertMassage, "Your lead has been converted", "Lead doesn't convert");
                break;
            case ("Nurturing"):
                edit();
                new DropDown(driver, "Rating", "Account").select("Warm");
                save();
                complete();

                convert();
                TimeUnit.SECONDS.sleep(4);
                convertMassage = driver.findElement(By.xpath(convertLocator)).getText();
                Assert.assertEquals(convertMassage, "Your lead has been converted", "Lead doesn't convert");
                break;
        }

    }

    public void save() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_SAVE));
        driver.findElement(BUTTON_SAVE).click();
    }

    public void complete() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(BUTTON_STATUS_COMPLETE)));
        WebElement element = driver.findElement(BUTTON_STATUS_COMPLETE);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void edit() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(BUTTON_EDIT));
        WebElement element = driver.findElement(BUTTON_EDIT);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void convert() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(BUTTON_CONVERT)));
        WebElement element = driver.findElement(BUTTON_CONVERT);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
