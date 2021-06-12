package tests.day15;

import org.testng.annotations.Test;
import pages.FacebookLoginPage;
import utilities.TestBase;

public class IIkPOMClass extends TestBase {
    /*1 - https://www.facebook.com/ adresine gidin
2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
4- Basarili giris yapilamadigini test edin*/
    @Test
    public void test01(){
        //1 - https://www.facebook.com/ adresine gidin
driver.get("https://www.facebook.com/");
//2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        FacebookLoginPage facebookLoginPage=new FacebookLoginPage(driver);
        facebookLoginPage.emailTextBox.sendKeys("cahan.94cebrayilova@gmail.com");
        facebookLoginPage.passwordTextBox.sendKeys("12345");
        facebookLoginPage.loginBtn.click();

    }
}
