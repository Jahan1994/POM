package tests.day16;

import org.testng.annotations.Test;
import pages.KoalaResortLoginPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C4_ConfigKullanmaTesti  extends TestBase {
   /*1 ) Bir Class olustur : PositiveTest
2) Bir test method olustur positiveLoginTest()
 http://qa-environment.koalaresorthotels.com adresine git
 login butonuna bas
 test data username: manager ,
 test data password : Manager1!
 Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et*/

 @Test
 public void test01(){
   //kodumu tamamen dinamik yapmak icin 3 dataya ihtiyacim var
     //1.locate==>bunlari page classdan object ureterek alabilirim
     //2.test datalari==>bunlar icin object olusturmama gerek yok
     //ConfigReader Classindan her sey static oldugu icin
     //sadece class ismi ile herseye ulasabilirim

     driver.get(ConfigReader.getProperty("kr_url"));
     KoalaResortLoginPage koalaResortLoginPage=new KoalaResortLoginPage(driver);
koalaResortLoginPage.login.click();
koalaResortLoginPage.username.sendKeys(ConfigReader.getProperty("kr_valid_username"));
koalaResortLoginPage.password.sendKeys(ConfigReader.getProperty("kr_valid_password"));
koalaResortLoginPage.loginButton.click();


 }

}
