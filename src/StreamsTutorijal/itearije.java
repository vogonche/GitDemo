package StreamsTutorijal;

import java.math.BigDecimal;

public class itearije {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		float suma = 5000;
		for (int i=0; i<10; i++)
		{
			//double temp = suma;
			
			float procenatSume = (float)(suma*(0.08f/1f));
			suma = suma + procenatSume;
			
			System.out.println(suma);
			System.out.println(i);
			
		}
		
	}

}
