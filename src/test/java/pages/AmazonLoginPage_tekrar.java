package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage_tekrar {
    WebDriver driver;
   public AmazonLoginPage_tekrar(WebDriver driver){
        this.driver=driver;
       PageFactory.initElements(driver,this);
    }
@FindBy(id = "twotabsearchtextbox")
public WebElement searchBox;
   @FindBy(xpath = "//img[@class='s-image']")
   public WebElement first;
   @FindBy(id = "priceblock_ourprice")
   public WebElement price;
}
