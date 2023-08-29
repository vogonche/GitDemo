import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=' User']")).click();
		// Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		// Thread.sleep(3000);
		WebElement staticDropdown = driver.findElement(By.xpath("//select"));
		staticDropdown.click();
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		// Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-item.active")));
		List<WebElement> elements = driver.findElements(By.className("btn-info"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement oneElement = elements.get(i);
			oneElement.click();
		}
		driver.findElement(By.cssSelector(".nav-item.active")).click();
	}

}
