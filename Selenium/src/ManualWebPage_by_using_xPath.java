import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManualWebPage_by_using_xPath {
		public static void main(String args[]) throws Exception {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("G:\\ABC-INS\\Selenium_html\\src\\UserName_Password.html");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("HelloJava");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("12345");
			Thread.sleep(3000);
			driver.close();
		}
}
