import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// Poziv browsera
		// Chrome - ChromeDriver -> Methods close get
		// Firefox - FirefoxDriver -> Methods close get
		// WebDriver close get
		// WebDriver methosd + class methods

		// chromedriver.exe -> Cgrome browser
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\webdriver\\chromedriver.exe");

		// webdriver.chrome.driver -> value of path
		// WebDriver driver = new ChromeDriver();

		// Firefox Launch
		// geckodriver
		// webdriver.gecko.driver
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\webdriver\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

		// Microsoft Edge
		// edge
		System.setProperty("webdriver.edge.driver", "C:\\webdriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();
	}

}
