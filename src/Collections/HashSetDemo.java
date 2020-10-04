package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Japan");
		hs.add("Manali");
		hs.add("Kullu");
		hs.add("Goa");
		hs.add("Phillipines");
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
	}
		
	}

}
