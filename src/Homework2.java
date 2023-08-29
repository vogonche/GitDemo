import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Jovica");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("email")).sendKeys("jovica.kuresevic@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234Test");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("06/15/1977");
		driver.findElement(By.className("btn-success")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("alert-success")).getText());
		
	}

}
