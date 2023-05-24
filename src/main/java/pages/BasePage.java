package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected final WebDriver driver;
    public String pageUrl;

    public BasePage(WebDriver driver, String pageUrl){
        this.driver = driver;
        this.pageUrl = pageUrl;
        PageFactory.initElements(driver, this);
    }


    public void isLoaded() throws Error {
        String realUrl = driver.getCurrentUrl().trim();
        if(!realUrl.equals(pageUrl)) {
            throw new Error("Wrong loaded page! Expected: " + pageUrl + " , but got: " + realUrl);
        }
    }

    public boolean isBrowserOpen() {
        boolean browserIsOpen;
        try {
            driver.getWindowHandles();
            browserIsOpen = true;
        } catch (NullPointerException e) {
            browserIsOpen = false;
        }
        return browserIsOpen;
    }
    protected <T> T executeOperationWithExplicitWait(ExpectedCondition<T> expectedCondition, int implicitWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        turnOffImplicitWait(driver);
        T result = wait.until(expectedCondition);
        turnOnImplicitWait(driver, implicitWait);
        return result;

        }

    private void turnOffImplicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    private void turnOnImplicitWait(WebDriver driver, int implicitWait) {
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    }





}
