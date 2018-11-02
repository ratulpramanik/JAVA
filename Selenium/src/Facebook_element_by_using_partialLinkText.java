import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_element_by_using_partialLinkText {
		public static void main(String[] args) throws Exception {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			WebElement link=driver.findElement(By.partialLinkText("Forgotten account?"));
				link.click();
				Thread.sleep(2000);
				driver.close();
		}
}
