import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CoreBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		//*2
		// da li je deljivo sa 2
		for(int i=0; i<arr2.length; i++ ) 
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				//break;
			}
			else
			{
				System.out.println(arr2[i] + " nije deljivo sa 2");
			}			
		}	
		
		ArrayList<String> a = new ArrayList<String>();
		// create object od the class - object.method
		a.add("Jovica");
		a.add("ZikaMika");
		a.add("LazaMaza");
		a.add("selenium");
		System.out.println(a.get(3));
		System.out.println("*************************************");
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*************************************");
		for ( String val: a)
		{
			System.out.println(val);
		}
		
		System.out.println("*************************************");
		//item is present in ArayList
		System.out.println(a.contains("selenium"));
		System.out.println("*************************************");
		
		String[] name = {"Pera", "Zika", "Mika"};
		List<String> nameArrayList =  Arrays.asList(name);
		
		System.out.println(nameArrayList.contains("selenium"));
		
	}

}
