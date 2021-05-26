package tests;

import models.Contact;
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
        Contact contact = new Contact("Asas", "Ddsa", "Adsad", "Aasdasd",
                "Test", "ASDAS", "qweqw@assadas.tom", "123321312", "123321123",
                "asdasd", "123321", "qweqwe", "qweqweqw",
                "qweqweqwe", "qweqwe", "qweqwe", "Mr.");
        contactsPage
                .open()
                .clickNewButton()
                .create(contact)
                .openDetailsTab()
                .validateContact(contact);


    }
}
