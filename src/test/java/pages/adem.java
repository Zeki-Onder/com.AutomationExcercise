package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adem {

    static @FindBy(xpath = "//*[@class='nav navbar-nav']")
    public WebElement verifyHomePage;

    static @FindBy(xpath = "//*[text()=\" Signup / Login\"]")
    public WebElement signinSignup;

    static @FindBy(xpath = "//*[text()=\"Login to your account\"]")
    public WebElement verifyLoginTo;

    @FindBy(xpath = "//*[text()=\"Login\"]")
    public WebElement btnLogin;

    @FindBy(xpath = "//*[text()=\"Your email or password is incorrect!\"]")
    public WebElement loginIncorrect;






}
