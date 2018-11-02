import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_element_by_using_subString_endWith {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.cssSelector("input[id$='erId']")).sendKeys("sachin@gmail.com");
		Thread.sleep(5000);
		driver.close();
	}
}
