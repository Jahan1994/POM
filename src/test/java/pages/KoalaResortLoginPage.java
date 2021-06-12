package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KoalaResortLoginPage {
    //1.Webdriver olustur
    WebDriver driver;
    //2.parametrli bir constructor olustur ve parametr olaraq Webdriver driver yaz
  public  KoalaResortLoginPage (WebDriver driver){
      //parametre olarak gelen driver ile bu classdaki driveri eslestir
      this.driver=driver;
      //PageFactory classini kullanarak initialize yap
      PageFactory.initElements(driver,this);

  }@FindBy(linkText = "Log in")
  public WebElement login;
  @FindBy(id = "UserName")
  public WebElement username;
  @FindBy(id = "Password")
  public WebElement password;
  @FindBy(id = "btnSubmit")
  public WebElement loginButton;

}
