package tests;

import models.Account;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;


public class AccountCreateTest extends BaseTest {
    @Test(description = "Creating account and it's validation")
    public void AccountShouldBeCreate() {
        boolean isOpened = logInPage
                .open()
                .IsPageOpened();
        assertTrue(isOpened, "LogIn page doesn't open");
        isOpened = logInPage
                .logIn(LOGIN, PASSWORD)
                .IsPageOpened();
        assertTrue(isOpened, "Home page doesn't open");
        Account account = new Account("Test", "+88005553535", "Press", "Allah-Akbar.cc",
                "Here is description", "Media", "12", "Moscow", "Arbat",
                "Vnukovo", "1233212", "Russia", "Zapadnaya",
                "Minsk", "Zapad", "123211", "Belarus");

        accountsPage
                .open()
                .clickNewButton()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);


    }
}
