package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]")
    private WebElement slider;

    @FindBy (xpath = "/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
    private WebElement myAccLink;

    public HomePage (WebDriver driver) {
        super(driver);
    }

    public MyAccPage clickAccBtn() {
        myAccLink.click();
        return new MyAccPage(driver);
        }
    }

