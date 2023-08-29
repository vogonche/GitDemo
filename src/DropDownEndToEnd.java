import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDownEndToEnd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("It's disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

		driver.findElement(By.id("divpaxinfo")).click();
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		/*
		 * driver.findElement(By.cssSelector(
		 * "input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		 * 
		 * 
		 * 
		 * driver.findElement(By.cssSelector(
		 * "input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		 * 
		 * 
		 * 
		 * //System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * Assert.assertFalse(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * Assert.assertTrue(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.className("ui-state-highlight")).click();
		 * 
		 * 
		 * driver.findElement(By.cssSelector(
		 * "input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		 * driver.findElement(By.cssSelector(
		 * "input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		 * 
		 * 
		 * 
		 * //count checkboxes //input[type='checkbox']
		 * 
		 * System.out.println(driver.findElements(By.cssSelector(
		 * "input[type='checkbox']")).size());
		 * 
		 * Assert.assertEquals(driver.findElements(By.cssSelector(
		 * "input[type='checkbox']")).size(), 6);
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("divpaxinfo")).click();
		 * //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * Thread.sleep(2000); //for (int i=1; i<5; i++) //{ //
		 * driver.findElement(By.id("hrefIncAdt")).click(); //} int i=1; while(i<5) {
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * driver.findElement(By.id("hrefIncAdt")).click();//4 times i++; }
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * 
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */

	}

}
