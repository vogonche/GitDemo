import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNG is one of the testing framework

public class UpdatedDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("ui-state-highlight")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		// System.out.println("Datum je: " +
		// driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("It's enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

		// count checkboxes
		// input[type='checkbox']

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);

		driver.findElement(By.id("divpaxinfo")).click();
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		// for (int i=1; i<5; i++)
		// {
		// driver.findElement(By.id("hrefIncAdt")).click();
		// }
		int i = 1;
		while (i < 5) {
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			driver.findElement(By.id("hrefIncAdt")).click();// 4 times
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	}

}
