package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class AccountCreateTest extends BaseTest {
    @Test
    public void createNewAccount() {
        boolean homePage = logInPage
                .open()
                .logIn(LOGIN, PASSWORD)
                .IsPageOpened();
        assertTrue(homePage, "Home page not opened");
        boolean accountPageOpened = accountsPage
                .openAccountPage()
                .IsPageOpened();
        assertTrue(accountPageOpened, "Accounts page doesn't open");
        boolean newAccountPageIsOpened = accountsPage
                .newAccountPage()
                .IsPageOpened();
        assertTrue(newAccountPageIsOpened, "Page to create new account doesn't open");
        newAccountPage.createNewAccount();
        driver.get("https://qa10tms.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        assertTrue(newAccountPage.AccountIsCreated(), "Account doesn't created");


    }
}
