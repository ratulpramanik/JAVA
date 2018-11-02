import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_element_by_using_tagName_className {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Sachin@gmail.com");
			Thread.sleep(2000);
			driver.close();

	}

}
