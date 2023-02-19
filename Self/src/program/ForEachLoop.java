package program;


import java.util.*;

class ExampleOfArrayList {

	public void arrayListExample() {
		
		List <String> name=new ArrayList<>();
		name.add("sanjay");
		name.add("vish");
		name.add("raju");
		name.add("cool");
		name.add("jarvis");
		name.add("sahil");
		
		/*
		 * for(String ne:name) { System.out.println(ne); }
		 */
		
		Iterator itr = name.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());	
		}
		
	}
	
	
}

public class ForEachLoop {
	public static void main(String args[]) {
		ExampleOfArrayList eo = new ExampleOfArrayList();
		eo.arrayListExample();
		
	}
}
