import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuappTest {

        @Test
        public void siteShiudBeOpen () {
                System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
                WebDriver browser = new ChromeDriver();
                browser.manage().window().maximize();
                browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                browser.manage().window().setSize(new Dimension(1024, 760));
                browser.get("http://the-internet.herokuapp.com/");
                browser.quit();
        }


}
