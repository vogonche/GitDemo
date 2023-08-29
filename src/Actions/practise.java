package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href=\"/windows\"]")).click();
		driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();
		Set<String> windows = driver.getWindowHandles(); // [parendid, childid]
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		String stringToPrintChild = driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(stringToPrintChild);
		driver.switchTo().window(parentID);
		String stringToPrintParent = driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(stringToPrintParent);

	}

}
