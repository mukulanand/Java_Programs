package Collections;

import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
		
		//for arraylist use java compliance 1.5
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("mukul");
		a.add("java");
		a.add("Raajgarh");
		a.add(1, "Coding");		
		a.add("Shera");		
		System.out.println(a);
		//a.clone(); //to create a copy of arraylist
		//System.out.println(a);
		System.out.println(a.contains("Coding"));
		System.out.println(a.get(3));
		System.out.println(a.getClass());
		a.remove(4);
		System.out.println(a);
		a.remove("Raajgarh");
		System.out.println(a);
		System.out.println(a.isEmpty());
				
	
	}

}
