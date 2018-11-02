import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_element_by_using_tagName_attribute {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sachin@gmail.com");
		Thread.sleep(5000);
		driver.close();

	}

}
