package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement tableToCheck = driver.findElement(By.id("product"));

		int numberOfRows = tableToCheck.findElements(By.tagName("tr")).size();
		int bumberOfColumns = tableToCheck.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).size();
		System.out.println("Number od columns: " + bumberOfColumns);
		System.out.println("Number of rows: " + numberOfRows);
		System.out.println(tableToCheck.findElements(By.tagName("tr")).get(1).getText());

	}

}
