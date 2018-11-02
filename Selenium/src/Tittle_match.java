import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tittle_match {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Expected title");
		String eTitle=scan.nextLine();
		String url="http://www.gmail.com";
		System.setProperty("webdriver.chrome.driver","G:\\Selenium jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);
		String aTitle=driver.getTitle();
		System.out.println("The expected title is " + eTitle);
		System.out.println("The expected title is " + aTitle);
		if(aTitle.equalsIgnoreCase(eTitle)) {
			System.out.println("PASS");
		}
		else {
			System.out.println();
		}
		driver.close();
	}

}
