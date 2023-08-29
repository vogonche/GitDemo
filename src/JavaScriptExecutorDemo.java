import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method
		// stubdocument.querySelector(".tableFixHead").scrollTop=5000

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");

		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000 ", "");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;

		for (int i = 0; i < values.size(); i++)

		{

			System.out.println(values.get(i).getText());

			Integer.parseInt(values.get(i).getText());

			sum = sum + Integer.parseInt(values.get(i).getText());

		}
		System.out.println(sum);
		
		int total =  Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		
		System.out.println(total);
		
		Assert.assertEquals(sum, total);
		

	}

}
