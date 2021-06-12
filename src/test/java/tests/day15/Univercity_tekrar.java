package tests.day15;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.UnivercityLoginPage_tekrar;
import utilities.TestBase;

public class Univercity_tekrar extends TestBase {
/*  1."http://webdriveruniversity.com/Actions" sayfasina gidin
2."Hover over Me First" kutusunun ustune gelin
3."Link 1" e tiklayin
4.Popup mesajini yazdirin
5.Popup'i tamam diyerek kapatin
6."Click and hold" kutusuna basili tutun
7. "Click and hold" kutusunda cikan yaziyi yazdirin
8. "Double click me" butonunu cift tiklayin*/
    @Test
    public void test01(){
        Actions actions=new Actions(driver);
        driver.get("http://webdriveruniversity.com/Actions");
        UnivercityLoginPage_tekrar uni=new UnivercityLoginPage_tekrar(driver);
      uni.hover.click();
      uni.link.click();
        System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();

    }

}
