import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.//
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//a[@value='MAA'] - xpath
		//a[@value='BLR'] - xpath
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))	
		{
			
			System.out.println("It's enabled");
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			
		}
		
		
		
		
		
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		////div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']
		//ctl00_mainContent_ddl_destinationStation1_CTNR
		
		
		
	}

}
