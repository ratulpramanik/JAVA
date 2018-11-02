import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url="http://www.gmail.com";
		driver.get(url);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		

	}

}
