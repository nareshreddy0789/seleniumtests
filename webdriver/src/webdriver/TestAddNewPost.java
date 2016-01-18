package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAddNewPost {
	 public static void main(String... args) {
	 WebDriver driver = new FirefoxDriver();
	 // Login to Admin portal
	 driver.get("http://syfyinfo.com/blog/wp-login.php");
	 WebElement email = driver.findElement(By.id("user_login"));
	 WebElement pwd = driver.findElement(By.id("user_pass"));
	 WebElement submit = driver.findElement(By.id("wp-submit"));
	 email.sendKeys("naresh");
	 pwd.sendKeys("komma1439");
	 submit.click();
	 // Go to AllPosts page
	 driver.get("http://syfyinfo.com/blog/wp-admin/edit.php");
	 // Add New Post
	 WebElement addNewPost = driver.findElement(By.linkText("Add New"));
	 addNewPost.click();
	 // Add New Post's Content
	 driver.switchTo().frame("content_ifr");
	 WebElement postBody = driver.findElement(By.id("tinymce"));
	 postBody.sendKeys("This is description");
	 driver.switchTo().defaultContent();
	 WebElement title = driver.findElement(By.id("title"));
	 title.click();
	 title.sendKeys("My selenium Post");
	 // Publish the Post
	 WebElement publish = driver.findElement(By.id("publish"));
	 publish.click();
	 }
	}