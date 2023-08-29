package StreamsTutorijal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	@Test
	// Count the number of names starting with alphabet A in list

	public void regular() {

		ArrayList<String> imena = new ArrayList<String>();
		imena.add("Aleksandar");
		imena.add("Dimitrije");
		imena.add("Avram");
		imena.add("Ambrozije");
		imena.add("Ruslan");

		int count = 0;

		for (int i = 0; i < imena.size(); i++) {

			String aktuelnoIme = imena.get(i);
			if (aktuelnoIme.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void streamFilter()

	
	
	{

		ArrayList<String> imena = new ArrayList<String>();
		imena.add("Aleksandar");
		imena.add("Dimitrije");
		imena.add("Avram");
		imena.add("Ambrozije");
		imena.add("Ruslan");
		
		//there is no life for intermediate op if there is no terminal op
		//terminal op  will execute only if inter op (filter) returns true
		//we can create stream
		//how to use filter in Stream API
		Long c = imena.stream().filter(s->s.startsWith("A")).count();
		System.out.println("Names " + c);
		
		Long d = Stream.of("Aleksandar", "Dimitrije", "Avram", "Ambrozije", "Ruslan").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println("aaaa " + d);
		
		imena.stream().filter(s->s.length()>7).forEach(s->System.out.println(s));
		imena.stream().filter(s->s.length()>7).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
		
		// print nmases od lenght > 7 with uppercase and have last letter e
		Stream.of("Aleksandar", "Dimitrije", "Avram", "Ambrozije", "Ruslan").filter(s->s.endsWith("e")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		//Print names whish start with A uppercase and sorted
		
		List<String>  names1 = Arrays.asList("Aleksandar", "Dimitrije", "Avram", "Ambrozije", "Ruslan");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s)); 
		
		//Merging 2 different lists
		Stream<String> spojeno =  Stream.concat(names.stream(), names1.stream());
		//spojeno.sorted().forEach(s->System.out.println(s));
		boolean flag =  spojeno.anyMatch(s->s.equalsIgnoreCase("Avram"));
		System.out.println(flag);
		System.out.println("*******************************************");
		Stream<String> spojeno2 =  Stream.concat(names.stream(), names1.stream());
		spojeno2.forEach(s->System.out.println(s));

			
	}
	
	@Test
	public void streamCollect()
	{
		List<String> ls = Stream.of("Aleksandar", "Dimitrije", "Avram", "Ambrozije", "Ruslan").filter(s->s.endsWith("e")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		// 
	
		List<Integer>  values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique numebr brom array
		//sort the array
		//and take 3rd index
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("**************************");
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("**************************");
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	
	}
	
	
	

}