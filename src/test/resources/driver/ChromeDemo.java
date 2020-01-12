package driver.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {
	public static void main(String[] args) {

		// Set System Property

		System.setProperty("webdriver.chrome.driver", "/Users/iuliapopusoi/Desktop/Selenium Jar Files/chromedriver");

		// Create a instance(object( of Chrome Driver class
		// And Lunching Browser

		WebDriver driver = new ChromeDriver();

		// using get() method to open a webpage or link or URL
		
		driver.get("https://noorteck.com/");

	}
}
