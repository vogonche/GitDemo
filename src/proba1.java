import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;

public class proba1 {
	static int maxValue ;
	public static String[] toStringArray(int[] intArray) {
        String[] res = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            res[i] = Integer.toString(intArray[i]);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] first = {"mika","laza","zika",};
        int[] second = {1,8,5,};
       String[] drugi = toStringArray(second);
        
        Object[][] arr1 = {  first , drugi  };
           
        Arrays.stream(arr1).forEach((i) -> {
            Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
            System.out.println();
        });
        
    


	}

}
