package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement textBoxInput = driver.findElement(By.id("autocomplete"));
		textBoxInput.sendKeys("Uni");
		// WebElement result =
		// driver.findElement(By.id("ui-id-1")).findElement(By.xpath("//*[text()='United
		// States (USA)']"));
		Actions a = new Actions(driver);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")))
				.findElement(By.xpath("//*[text()='United States (USA)']"));
		a.moveToElement(driver.findElement(By.id("ui-id-1")).findElement(By.xpath("//*[text()='United States (USA)']")))
				.perform();

	}

}
