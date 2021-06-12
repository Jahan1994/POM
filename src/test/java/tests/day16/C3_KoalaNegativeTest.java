package tests.day16;

import org.testng.annotations.Test;
import pages.KoalaResortLoginPage;
import utilities.TestBase;

public class C3_KoalaNegativeTest extends TestBase {
    @Test
    public void negatifTest(){
        driver.get("http://qa-environment.koalaresorthotels.com ");
        KoalaResortLoginPage koalaResortLoginPage=new KoalaResortLoginPage(driver);
        koalaResortLoginPage.login.click();
        koalaResortLoginPage.username.sendKeys("manager1");
        koalaResortLoginPage.password.sendKeys("manager1!");
        koalaResortLoginPage.loginButton.click();
    }
}




