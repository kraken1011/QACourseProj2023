package tests;

import base.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class RegistrationTest extends TestUtil {

    @Given("the user is already on the account registration page")
    public void the_user_is_already_on_the_account_registration_page() {
        boolean regPageLoaded = true;
        try {
            myAccPage.isLoaded();
        } catch (Error error) {
            regPageLoaded = false;
        }
        Assertions.assertTrue(regPageLoaded);
        throw new io.cucumber.java.PendingException();
    }
    @When("the user id Ivan and password asjdhhjasl@8usd are provided")
    public void the_user_id_ivan_and_password_asjdhhjasl_8usd_are_provided() {
        myAccPage.fillUserNameAndPwdReg();
        throw new io.cucumber.java.PendingException();
    }
    @When("the registration button is clicked")
    public void the_registration_button_is_clicked() {
        myAccPage.getRegisterBtn();
        myAccPage.viewAccSignedInPage();
        throw new io.cucumber.java.PendingException();
    }
    @Then("a successful registration is completed")
    public void a_successful_registration_is_completed() {
        accDetailsPage.isLoaded();
        throw new io.cucumber.java.PendingException();
    }
}
