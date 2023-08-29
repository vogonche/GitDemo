package Exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. Give me the count of links on the page.
		// 2. Give me the count of links in footer section
		// 3. Give me the count of links in first column of footer section

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		// 3
		WebElement columnFirst = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnFirst.findElements(By.tagName("a")).size());

		// 4. click on each lick in the column and check if pageas are opening-

		for (int i = 1; i < columnFirst.findElements(By.tagName("a")).size(); i++) {

			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnFirst.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
