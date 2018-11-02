import org.openqa.selenium.chrome.ChromeDriver;

public class Source_code_LunchApp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		String url="http://www.gmail.com";
		driver.get(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();

	}

}
