package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class AccountCreateTest extends BaseTest {
    @Test
    public void AccountShouldBeCreate() {
        boolean isOpened = logInPage
                .open()
                .IsPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = logInPage
                .logIn("dmitryrak11-fcsk@force.com", "password01")
                .IsPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
        Account account = new Account("Test", "+375293350019", "tut.by","Lasdoasdkasodkas",
                );
        accountsPage
                .open()
                .clickNewButton()
                .create(Account)
                .openDetailsTab()
                .validateAccount();

    }
}
