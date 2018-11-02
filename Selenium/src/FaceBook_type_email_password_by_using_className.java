import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_type_email_password_by_using_className {
		public static void main(String args[]) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			WebElement email=driver.findElement(By.className("inputtext"));
			email.sendKeys("sachin@gmail.com");
			Thread.sleep(3000);
			WebElement pass=driver.findElement(By.className("inputtext"));
			pass.sendKeys("Tandulkar");
			Thread.sleep(5000);
			driver.close();

		}
}
