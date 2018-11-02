import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_forgottenAccount_by_using_link {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement link=driver.findElement(By.linkText("Forgotten account?"));
			link.click();
			Thread.sleep(2000);
			driver.close();
	}

}
