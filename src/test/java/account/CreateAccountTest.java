package account;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.createAccountPage;

public class CreateAccountTest extends BaseTest {

    @Test
    public void testPasswordValidation() throws InterruptedException {
        createAccountPage createAccountPage = homePage.clickCreateAccount();
        createAccountPage.setEmail("test@test.com");
        createAccountPage.setPassword("1234");
        createAccountPage.checkTerms();
        createAccountPage.checkNews();
        createAccountPage.checkPrivacy();

    }
}
