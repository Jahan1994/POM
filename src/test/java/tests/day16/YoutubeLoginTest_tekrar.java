package tests.day16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.YoutubeLoginPage_tekrar;
import utilities.TestBase;

public class YoutubeLoginTest_tekrar extends TestBase {
    @Test
    public void test01(){
        driver.get("http://youtube.com");
        YoutubeLoginPage_tekrar yt=new YoutubeLoginPage_tekrar(driver);
        yt.searchbox.sendKeys("Sami Yusuf");
        yt.searchbox.submit();

    }
}
