import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_type_email_by_using_id {
		public static void main(String args[]) throws InterruptedException {
			String url="http://www.facebook.com";
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("sachin@gmail.com");
			Thread.sleep(5000);
			driver.close();
			
		}
}
