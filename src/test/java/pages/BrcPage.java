package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage() {  // constructor oluştur
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement brclogin;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement UserEmail;


    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;


    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLogin;
}
