package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnivercityLoginPage_tekrar {
    WebDriver driver;
   public UnivercityLoginPage_tekrar (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//button[text()='Hover Over Me First!']")
    public WebElement hover;
@FindBy(xpath = "//a[@class='list-alert']")
   public WebElement link;
}
