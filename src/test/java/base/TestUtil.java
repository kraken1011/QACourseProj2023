package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Slf4j
public class TestUtil {

    public WebDriver driver;
    private String url;
    private int implicitWait;



    @BeforeMethod
    public void setUp() {
        try (FileInputStream configFile = new FileInputStream("src/test/resources/config.properties")) {
            Properties config = new Properties();
            config.load(configFile);
            url = config.getProperty("urlAddress");
            implicitWait = Integer.parseInt(config.getProperty("implicitWait"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        loadUrl();
        setupBrowserDriver();
    }



    private void loadUrl() {
        driver.get(url);
    }

    private void setupBrowserDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Start-Maximized");
        options.addExtensions(new File("src/test/java/resources/chromeExtensions/Adblocker2.crx"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

