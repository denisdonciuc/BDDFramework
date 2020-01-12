package driver.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefaxDemo {

	public static void main(String[] args) {

		// Set System Property

		System.setProperty("webdriver.gecko.driver", "/Users/iuliapopusoi/Desktop/Selenium Jar Files/geckodriver");

		// Create a instance(object) of Firefox Driver class
		// And Lunching Browser

		WebDriver driver = new FirefoxDriver();

		// using get() method to open a webpage or link or URL

		driver.get("https://noorteck.com/");
		driver.close();

	}
}
