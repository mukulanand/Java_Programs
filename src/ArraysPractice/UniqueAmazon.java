package ArraysPractice;

import java.util.ArrayList;

public class UniqueAmazon {
	public static void main(String[] args) {

		int a[]={4,5,5,5,4,6,4,6,9};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++){
				int k=0;     //k will work for every no such as (4,5,6 etc) from every starting of a loop
			if(!al.contains(a[i])){  //here we have used ! operator so bcoz a[i] doesn't consist element until we add it in to a oontainer and condition
									//becomes false, so false + negation= true so it will enter in the loop and now will add the value
									//so we need to make the condition true to make it enter in to a loop to add the value
				
			al.add(a[i]);
			k++;   //4  k=1
			
			for(int j=i+1;j<a.length;j++){
		
			if(a[i]==a[j]){  //is 5===4 (no)
				k++;   //4==4  k=1
			}
		}
			
			//System.out.println(a[i]);
			//System.out.println(k);
			if(k==1){
				
				System.out.println(a[i] + " is a unique no.");
			}
			
			}
		}
		
		
	}

}
