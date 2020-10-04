package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap <Integer, String>();
		hm.put(0, "Rose");
		hm.put(1, "Lily");
		hm.put(2, "Sunflower");
		hm.put(50, "Lotus");
		hm.put(5, "Caterpillar");
		System.out.println(hm.get(4));
		Set sn=hm.entrySet();
		Iterator i=sn.iterator();
		while(i.hasNext()){
			//now to get the separate key and separate value in the set, we need to cast (i.next) using map class
			//bcoz there are two boxes in the set one for key and another for value.
			Map.Entry m=(Map.Entry)i.next();  
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}

}
