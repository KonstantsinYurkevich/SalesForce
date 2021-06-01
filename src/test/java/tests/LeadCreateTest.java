package tests;

import models.Lead;
import models.LeadFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LeadCreateTest extends BaseTest {
    @Test(description = "Create new lead and validate it")
    public void LeadShouldBeCreated() {
        boolean isOpened = logInPage
                .open()
                .IsPageOpened();
        assertTrue(isOpened, "LogIn page doesn't open");
        isOpened = logInPage
                .logIn(LOGIN, PASSWORD)
                .IsPageOpened();
        assertTrue(isOpened, "Home page doesn't open");
        Lead lead = LeadFactory.get();
        leadsPage
                .open()
                .clickNewButton()
                .create(lead)
                .openDetailsTab()
                .validateLead(lead);


    }
}
