package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccPage extends BasePage {

    @FindBy (id = "reg_email")
    WebElement regEmailInputBox;

    @FindBy (id = "reg_password")
    WebElement regPassword;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[3]/input[3]")
    WebElement registerBtn;

    @FindBy (id = "username")
    WebElement usernameInput;

    @FindBy (id = "password")
    WebElement passwordInput;

    public MyAccPage (WebDriver driver){
        super(driver, "https://practice.automationtesting.in/my-account/");
    }

    public String getRegisterBtn (){
        executeOperationWithExplicitWait(ExpectedConditions.visibilityOf(registerBtn), 4);
        return registerBtn.getText();
    }

    public MyAccPage fillUserNameAndPwdReg(){
        regEmailInputBox.sendKeys("Ivan@abv.bg");
        regPassword.sendKeys("asjdhhjasl@8usd");
        return new MyAccPage(driver);
    }

    public AccSignedInPage viewAccSignedInPage(){
        registerBtn.click();
        return new AccSignedInPage(driver);
    }

    public AccSignedInPage loginUserPass(String usernameField, String passwordField) {
        usernameInput.sendKeys(usernameField);
        passwordInput.sendKeys(passwordField);
        return new AccSignedInPage(driver);
    }
}
