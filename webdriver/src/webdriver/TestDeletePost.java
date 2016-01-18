package webdriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class TestDeletePost {
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
		 // Add New Post's Content
		 WebElement post = driver.findElement(By.linkText("My selenium Post"));
				  post.click();
				  // Delete Post
				  WebElement publish = driver.findElement(By.linkText("Move to Trash"));
				  publish.click();
				  }
				 }


