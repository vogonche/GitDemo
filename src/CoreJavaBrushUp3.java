
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object //string literal
		
		String s1 = "Rahul Shetty Academy";
		String s5 = "hello";
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
	
		String s = "Rahul Shetty Academy";
		String[] SplittedString =  s.split("Shetty");
		
		
		System.out.println("*************************************");
		System.out.println(SplittedString[0]);
		System.out.println("*************************************");
		System.out.println(SplittedString[1]);
		System.out.println("*************************************");
		//System.out.println(SplittedString[2]);
		
		System.out.println(SplittedString[1].trim());
		System.out.println("*************************************");
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
			System.out.println("+++++++++++++++++++++++++++++++++++");
		}
		
		for(int i=0; i<s.length();  i++)
		{
			System.out.println(s.charAt(i));
			System.out.println("11111111111111111111111111111");
		}
		
		
	}
	

}
