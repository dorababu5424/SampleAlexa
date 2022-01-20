package Basa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
        public static WebDriver driver;
        public String BaseUrl ="https://www.amazon.in/";
    @BeforeClass
    public void LunchBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(BaseUrl);
    }

    @AfterClass
    public void tearDown(){

        //driver.quit();
    }
}
