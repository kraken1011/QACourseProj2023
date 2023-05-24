package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccDetailsPage  extends BasePage{

    @FindBy(id = "account_first_name")
    WebElement firstNameInput;

    @FindBy (id = "account_last_name")
    WebElement lastNameInput;

    @FindBy (id = "account_email")
    WebElement emailInputBox;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/p[4]/input[3]")
    WebElement saveBtn;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/nav/ul/li[6]/a")
    WebElement signOutLink;

    public AccDetailsPage (WebDriver driver) {
        super(driver, "https://practice.automationtesting.in/my-account/edit-account/");
    }

    public void checkEmailAddress () {
        emailInputBox.getText();
    }

    public AccDetailsPage fillName () {
        firstNameInput.sendKeys("Ivan");
        lastNameInput.sendKeys("Ivanov");
        return new AccDetailsPage(driver);
    }

    public AccDetailsPage saveChanges () {
        saveBtn.click();
        return new AccDetailsPage(driver);
    }

    public MyAccPage logOut() {
        signOutLink.click();
        return new MyAccPage(driver);
    }
}
