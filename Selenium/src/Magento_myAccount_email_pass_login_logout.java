import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento_myAccount_email_pass_login_logout {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://magento.com/");
		driver.findElement(By.linkText("My Account")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("sucheendra.abc@gmail.com");
		
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		
		Thread.sleep(5000);
		driver.findElement(By.id("send2")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
