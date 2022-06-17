package stepDefinitons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.adem;

public class StepDefinition_03 extends adem {




    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://automationexercise.com");

        WebElement verifyHomePage= driver.findElement(By.xpath("//*[@class='nav navbar-nav']"));

        verifyHomePage.click();

        WebElement signUp = driver.findElement(By.xpath("//*[text()=\" Signup / Login\"]"));
        signUp.click();

        WebElement verifyLogin = driver.findElement(By.xpath("//*[text()=\"Login to your account\"]"));
        verifyLogin.click();

        WebElement incorrectAddressMail = driver.findElement(By.xpath("//*[@data-qa=\"login-email\"]"));
        incorrectAddressMail.sendKeys("asd1234@gmail.com");

        WebElement incorrectAddressPass = driver.findElement(By.xpath("//*[@data-qa=\"login-password\"]"));
        incorrectAddressPass.sendKeys("123456");

        WebElement clickLogin = driver.findElement(By.xpath("//*[@data-qa=\"login-button\"]"));
        clickLogin.click();

        WebElement verifyNotLogin = driver.findElement(By.xpath("//*[text()=\"Your email or password is incorrect!\"]"));
        verifyNotLogin.getText().equals("Your email or password is incorrect!");

    }
}

