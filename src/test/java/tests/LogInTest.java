package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LogInTest extends BaseTest {
    @Test
    public void logIn() {
        boolean isOpened = logInPage
                .open()
                .IsPageOpened();
        assertTrue(isOpened, "LogIn page doesn't open");
        isOpened = logInPage
                .logIn(LOGIN, PASSWORD)
                .IsPageOpened();
        assertTrue(isOpened, "Home page doesn't open");
    }
}
