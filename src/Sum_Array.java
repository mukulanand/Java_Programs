
public class Sum_Array {
	public static void main(String[] args) {
		
		//tha sum of elements in array, index of value in array, break the loop after getting our element
		
		int a[]={1,2,3,4,5,6};
		
		int sum=0;
		for(int i=0;i<a.length;i++){
			//sum=sum+a[i];
			//System.out.println(sum);  here it will print fibonacci series
			//sum=a[i];
			if(a[i]==5){
			System.out.println("the index of 5 is " + i);
			break;  //after getting my value 5 at 4th rank, the loop will get break
			
			}
			System.out.println(a[i]);  //here u can see that the loop goes till 4 and then break
		}
		//System.out.println(sum); //here it will print the sum of no in array
	}

}
