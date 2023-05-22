package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccSignedInPage  extends BasePage{

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]/a")
    WebElement signOutLink;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/nav/ul/li[5]/a")
    WebElement accDetailsLink;

    public MyAccPage viewMyAccPageForLogin(WebDriver driver){
        signOutLink.click();
        return new MyAccPage(driver);
    }

    public AccSignedInPage (WebDriver driver){
        super(driver);
    }

    public AccDetailsPage viewAccDetailsPage() {
        accDetailsLink.click();
        return new AccDetailsPage(driver);
    }






}
