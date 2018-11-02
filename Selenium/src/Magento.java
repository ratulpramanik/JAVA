import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium jar\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String web="http:\\www.magento.com";
		driver.get(web);
		Thread.sleep(5000);
		driver.close();
		
	}

}
