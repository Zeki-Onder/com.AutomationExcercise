package stepDefinitons;

import io.cucumber.java.en_old.Ac;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StepDefinition_09 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("http://automationexercise.com");
        WebElement verifyHomePage= driver.findElement(By.xpath("//*[@class='nav navbar-nav']"));

        verifyHomePage.click();

        Actions actions =new Actions(driver);
        driver.findElement(By.xpath(" //*[text()=\" Products\"]")).click();
        driver.findElement(By.xpath(" //*[text()=\"All Products\"]")).getText().equals("All Products");
        driver.findElement(By.xpath(" //*[@id=\"search_product\"]")).sendKeys("Men");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath(" //*[@id=\"submit_search\"]")).click();

        driver.findElement(By.xpath(" //*[text()=\"Searched Products\"]")).getText().equals("Searched Products");




   }
}