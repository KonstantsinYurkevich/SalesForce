package tests;

import models.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import tests.base.Retry;

import static org.testng.Assert.assertTrue;

public class ContactCreateTest extends BaseTest {
    @Test(description = "Create new contact and validate it", retryAnalyzer = Retry.class)
    public void ContactShouldBeCreated() {
        boolean isOpened = logInPage
                .open()
                .IsPageOpened();
        assertTrue(isOpened, "LogIn page doesn't open");
        isOpened = logInPage
                .logIn(LOGIN, PASSWORD)
                .IsPageOpened();
        assertTrue(isOpened, "Home page doesn't open");
        Contact contact = new Contact("Asas", "DSA", "ASDASD", "ASDDDAA", "ASDAS"
                , "qweqw@assadas.tom", "123321312", "123321123", "asdasd", "123321", "qweqwe", "qweqweqw"
                , "qweqweqwe", "qweqwe", "qweqwe", "Mr.");
        contactsPage
                .open()
                .clickNewButton()
                .create(contact)
                .openDetailsTab()
                .validateContact(contact);


    }
}
