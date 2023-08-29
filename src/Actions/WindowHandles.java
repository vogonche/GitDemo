package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); // [parendid, childid]

		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);

		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		System.out.println(email);

		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(email);

		// System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

	}

}
