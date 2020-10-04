
public class Armstrong {
	public static void main(String[] args) {
		//153, 370, 371, 407
		
		int no=407;
		int temp=no;
		int rem, sum=0;
	while(temp>0){
		rem=temp%10;
		temp=temp/10;
		sum=sum+rem*rem*rem;

	}
		if(sum==no){
			System.out.println(sum+ " the no is armstrong");
			
		}
		else{
			
			System.out.println(sum+ " the no is not armstrong");
		}
	}

}
