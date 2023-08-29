package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));		
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));	
		String textToPrint =  driver.findElement(By.id("content")).getText();
		System.out.println(textToPrint);
	}

}
