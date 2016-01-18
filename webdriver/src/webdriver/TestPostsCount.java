package webdriver;


	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class TestPostsCount {
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
		// Count the number of posts.
		 driver.get("http://syfyinfo.com/blog/wp-admin/edit.php");
		 WebElement postsContainer = driver.findElement(By.id("the-list"));
		 List postsList = postsContainer.findElements(By.tagName("tr"));
		System.out.println(postsList.size());
		}
}