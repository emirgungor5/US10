package cydeo.pages;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {


    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='user']")
    public WebElement inputUsername;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement inputpassword;
    @FindBy(xpath = "//*[@id='submit-form']")
    public WebElement LogInButton;
    @FindBy(xpath = "//img[contains(@src, 'php')]")
    public WebElement UsernameButton;
    @FindBy(xpath = "//a[contains(@href, 'j')]")
    public WebElement LogOutButton;



}
