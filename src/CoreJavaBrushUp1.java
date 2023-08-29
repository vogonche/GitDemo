
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		String website = "Jovica Kuresevic"; 
		char letter = 'r';
		double dec = 5.99;
		boolean myCart = true;
		
		System.out.println(num+ " is value stored in num variable");
		System.out.println(website);
		
		
		//Arrays - 
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6,12,222};
		
		// for loop
		for (int i = 0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Pera", "Zika", "Mika"};		
		for (int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for (String s: name)
		{
			System.out.println(s);
			
		}
		
		for (int clanoviNiza: arr2)
		{
			System.out.println(clanoviNiza);
		}
		
		
	}

}
