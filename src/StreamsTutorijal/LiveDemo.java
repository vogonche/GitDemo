package StreamsTutorijal;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture values all web elements into list
		List<WebElement> lista1 = driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all web elements into new (original) list
		List<String> originalList = lista1.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original list of step 3 -> sorted list
		List<String> sortedList =  originalList.stream().sorted().collect(Collectors.toList());
		//compare original vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		//get scan the name column with get text ->  Beans ->print the price of the Rice
		List<String> price = lista1.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
	}

	private static String getPriceVeggie( WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}


}
