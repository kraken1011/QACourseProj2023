package tests;

import base.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterTest;
import pages.BasePage;
import pages.HomePage;

public class AccDetailsTest  extends TestUtil {
    @Given("that the user is already on the Account Details page")
    public void that_the_user_is_already_on_the_account_details_page() {
        Assertions.assertTrue(myAccPage.isBrowserOpen());
        boolean accountPageLoaded = true;
        try {
            myAccPage.isLoaded();
        } catch (Error error){
            accountPageLoaded = false;
        }
        Assertions.assertTrue(accountPageLoaded);
        throw new io.cucumber.java.PendingException();
    }

    @When("the user fills their first and last names")
    public void the_user_fills_their_first_and_last_names() {
        accDetailsPage.fillName();

    }
    @When("the user checks if the email corresponds to the email they entered")
    public void the_user_checks_if_the_email_corresponds_to_the_email_they_entered () {
            accDetailsPage.checkEmailAddress();
            throw new io.cucumber.java.PendingException();
        }
    @Then("the user logs out")
       public void the_user_logs_out () {
            accDetailsPage.logOut();
          throw new io.cucumber.java.PendingException();
        }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }
}
