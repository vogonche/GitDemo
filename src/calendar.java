import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		
		Thread.sleep(2000);
		
		//April 14
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		//August 24, 2023
		
		driver.findElement(By.xpath("//span[@aria-label='August 24, 2023']")).click();
		
		
		
	}

}
