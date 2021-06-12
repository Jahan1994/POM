package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class YoutubeLoginPage_tekrar {
    WebDriver driver;

    public YoutubeLoginPage_tekrar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id="search")
public WebElement searchbox;
}