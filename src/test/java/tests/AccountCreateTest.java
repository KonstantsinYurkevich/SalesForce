package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;


public class AccountCreateTest extends BaseTest {
    @Test(description = "Creating  account and it's validation")
    public void AccountShouldBeCreate() {
        boolean isOpened = logInPage
                .open()
                .IsPageOpened();
        assertTrue(isOpened, "LogIn page doesn't open");
        isOpened = logInPage
                .logIn(LOGIN, PASSWORD)
                .IsPageOpened();
        assertTrue(isOpened, "Home page doesn't open");
        Account account = AccountFactory.get();

        accountsPage
                .open()
                .clickNewButton()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);


    }
}
