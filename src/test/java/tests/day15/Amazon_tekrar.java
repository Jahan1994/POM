package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonLoginPage_tekrar;
import utilities.TestBase;

public class Amazon_tekrar extends TestBase {
    @Test
    public void test01(){
        driver.get("http://amazon.com");
        AmazonLoginPage_tekrar amazonLoginPage=new AmazonLoginPage_tekrar(driver);
        amazonLoginPage.searchBox.sendKeys("baby"+ Keys.ENTER);
        amazonLoginPage.first.click();
        System.out.println(amazonLoginPage.price.getText());
    }
}
