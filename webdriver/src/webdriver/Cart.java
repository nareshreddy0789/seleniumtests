package webdriver;

   import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

    public class Cart {
    static WebDriver driver = new FirefoxDriver();
    @Test
    public void method() {
    driver.get("http://www.amazon.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 20);
    WebElement ele =wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("swiss army knife");
    driver.findElement(By.className("nav-input")).click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.linkText("Rugged Knife Multitool Swiss Style Army Pocket Knife Black")).click();
	 WebElement add1 = driver.findElement(By.id("add-to-cart-button"));
	 add1.click();
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.findElement(By.linkText("Victorinox Swiss Army Classic SD Pocket Knife")).click();
	 WebElement add2 = driver.findElement(By.id("add-to-cart-button"));
	 add2.click();
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.findElement(By.linkText("Victorinox Super Tinker Swiss Army Knife")).click();
	 WebElement add3 = driver.findElement(By.id("add-to-cart-button"));
	 add3.click();
	 String quantity = driver.findElement(By.xpath(".//*[@id='nav-cart-count']")).getText();
	 int n = Integer.parseInt(quantity);
	 if(n==3){
	 System.out.println(" 3 items has been added to cart");
    }
    }
    }
