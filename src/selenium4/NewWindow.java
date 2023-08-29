package selenium4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Iterators;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8));
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles =  driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String ChildWindowId = it.next();
		driver.switchTo().window(ChildWindowId);
		
		driver.get("https://rahulshettyacademy.com/");
		
		//Thread.sleep(6000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")));
		
 		String courseName =  driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
 		driver.switchTo().window(parentWindowId);
 		
 		WebElement name = driver.findElement(By.name("name"));
 		name.sendKeys(courseName);
 		//screenshot
 		File file = name.getScreenshotAs(OutputType.FILE);
 		FileUtils.copyFile(file, new File("c://temp//logo.png"));
 		
 		//get height and weight
 		
 		System.out.println(name.getRect().getHeight());
 		System.out.println(name.getRect().getWidth());
 		
 		
 		
 		driver.quit();
 		
 		
 		
		//driver.findElement(null)
		
		
		
		
		//driver.switchTo().window()
		

	}

}
