import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;

public class WindowAcivities {

	public static String[] toStringArray(int[] intArray) {
        String[] res = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            res[i] = Integer.toString(intArray[i]);
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.manage().window().maximize(); driver.get("http://google.com");
		 * driver.navigate().to("https://rahulshettyacademy.com");
		 * driver.navigate().back(); driver.navigate().forward();
		 */
		
		 	String[] first = {"mila","laza","zika",};
	        int[] second = {1,8,5,};
	       String[] drugi = toStringArray(second);
	        
	        String[][] arr1 = {  first , drugi  };
	        
	        //String [][] kombinovano;
	        
	        
	        //String[] strArray = Arrays.stream(second).mapToObj(String::valueOf).toArray(String[]::new);

	        
	        Arrays.stream(arr1).forEach((i) -> {
	            Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
	            System.out.println();
	        });
	        
	        
	        //String[][] kombinovano = {{first},{first}};
	        

	}

}
