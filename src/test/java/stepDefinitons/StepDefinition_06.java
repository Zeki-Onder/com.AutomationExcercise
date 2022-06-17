package stepDefinitons;

import io.cucumber.java.en_old.Ac;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.basic.BasicSliderUI;


public class StepDefinition_06 {

    @Test
    public void test() throws InterruptedException {
     WebDriverManager.chromedriver().setup();

     ChromeDriver driver = new ChromeDriver();
     Actions act =new Actions(driver);
     driver.manage().window().maximize();
     driver.get("http://automationexercise.com");

     WebElement contactUs = driver.findElement(By.xpath("//*[text()=\" Contact us\"]"));
     contactUs.click();

     WebElement getInTouchVisibleVerify = driver.findElement(By.xpath("//*[text()=\"Get In Touch\"]"));
     getInTouchVisibleVerify.getText().equals("Get In Touch");

     WebElement name = driver.findElement(By.xpath("//*[@data-qa=\"name\"]"));
     name.sendKeys("Adem");

     WebElement email = driver.findElement(By.xpath("//*[@data-qa=\"email\"]"));
     email.sendKeys("Adem@gmail.com");

     WebElement subject = driver.findElement(By.xpath("//*[@data-qa=\"subject\"]"));
     subject.sendKeys("Hatali Urun");

     driver.findElement(By.xpath("//*[@data-qa=\"message\"]")).sendKeys("deneme");
     //act.sendKeys(Keys.TAB).click().perform();

    String dosyaYolu =System.getProperty("user.home")+"1.png";
    // WebElement dosyaSec =driver.findElement(By.xpath("//*[@name=\"upload_file\"]"));
     act.sendKeys(Keys.PAGE_DOWN).
             sendKeys(Keys.TAB).
             perform();
        act.sendKeys(Keys.SPACE).perform();

    driver.findElement(By.xpath("//*[@data-qa=\"submit-button\"]")).submit();



   driver.quit();

    }
}