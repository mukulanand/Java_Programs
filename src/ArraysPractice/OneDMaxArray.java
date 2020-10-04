package ArraysPractice;

public class OneDMaxArray {
	public static void main(String[] args) {
			
		int a[]={4,6,5,8,9,2};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
				
				if(a[i]>max){
					max=a[i];
	//				System.out.println(max);
				}
				else if(a[i]<min){
					min=a[i];
				}
		}
		System.out.println(min); //min element in an array
		System.out.println(max);  //max element in an array
	}

}
