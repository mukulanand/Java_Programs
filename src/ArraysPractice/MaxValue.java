package ArraysPractice;

public class MaxValue {
	public static void main(String[] args) {

		int a[][]={{12,4,6},{3,5,8},{1,10,0}};
		int max=a[0][0];  //here we always assume the first no. of matrix is min and then compare it with all no
							//present in the matrix
				
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				if(a[i][j]>max) {  //first of all the loop will check all the no less than 2 but didnt 
									//put them in min variable. If I will print them in loop then it will show me
									//and for whole, firstly it will go out of loop
					
					
					max=a[i][j];
					
					
				}
				
			}
		}
			System.out.println(max);
		
		
		
	}

}
