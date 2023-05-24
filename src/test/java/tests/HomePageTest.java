package tests;

import base.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HomePageTest  extends TestUtil {


    @Given("the browser is open")
    public void the_browser_is_open() {
        Assertions.assertTrue(homePage.isBrowserOpen());
        throw new io.cucumber.java.PendingException();
    }
    @When("the home page is entered by the user")
    public void the_home_page_is_entered_by_the_user() {
        boolean homePageLoaded = true;
        try {
            homePage.isLoaded();
        } catch (Error error) {
            homePageLoaded = false;
        }
        Assertions.assertTrue(homePageLoaded);
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user sees the slides on the home page")
    public void the_user_sees_the_slides_on_the_home_page() {
        int slidesNum = homePage.isSliderVisible();
        Assertions.assertEquals(slidesNum, 3);
        throw new io.cucumber.java.PendingException();


    }


    @When("the user clicks on the My account hyperlink")
    public void the_user_clicks_on_the_my_account_hyperlink() {
        homePage.clickAccBtn();
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user is no longer on the home page")
    public void the_user_is_no_longer_on_the_home_page() {
            boolean stillOnHomePage = true;
            try {
                homePage.isLoaded();
            } catch (Error error) {
                stillOnHomePage = false;
            }
            Assertions.assertFalse(stillOnHomePage);
        throw new io.cucumber.java.PendingException();
        }

    }


