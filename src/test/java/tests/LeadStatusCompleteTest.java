package tests;


import models.Lead;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LeadStatusCompleteTest extends BaseTest {
    @Test(description = "Create new lead and mark complete")
    public void CreateAndMarkCompleteLead() throws InterruptedException {
        boolean isOpened = logInPage
                .open()
                .IsPageOpened();
        assertTrue(isOpened, "LogIn page doesn't open");
        isOpened = logInPage
                .logIn(LOGIN, PASSWORD)
                .IsPageOpened();
        assertTrue(isOpened, "Home page doesn't open");
        Lead lead = new Lead("Lfsaf", "asfasf", "weqqwdas", "okokok", "Title",
                "blabla@qweqweqw.com", "qweqwqwe", "qqweqwe", "tut.by", "Onliner", "12",
                "qweqwe", "qweqwe", "qweqwe", "qweqwe", "qweqwe", "Mr.",
                "New", "Hot", "Banking", "Advertisement");
        leadsPage
                .open()
                .clickNewButton()
                .create(lead)
                .openDetailsTab()
                .editLeadToStatusComplete(lead.getDropdown_lead_status());


    }

}
