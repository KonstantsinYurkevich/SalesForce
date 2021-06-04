package tests;

import models.Account;
import models.AccountFactory;
import models.Contact;
import models.ContactFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class ContactCreateTest extends BaseTest {
    @Test(description = "Create new contact and validate it")
    public void ContactShouldBeCreated() {
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
        Contact contact = ContactFactory.get();
        contactsPage
                .open()
                .clickNewButton()
                .create(contact, account.getAccountName())
                .openDetailsTab()
                .validateContact(contact,account.getAccountName());


    }
}
