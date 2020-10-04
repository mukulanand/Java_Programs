package ArraysPractice;

public class MinValue {
	public static void main(String[] args) {

		int a[][]={{2,4,6},{3,5,8},{1,7,0}};
		int min=a[0][0];  //here we always assume the first no. of matrix is min and then compare it with all no
							//present in the matrix
				
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				if(a[i][j]<min) {  //first of all the loop will check all the no less than 2 but didnt 
									//put them in min variable. If I will print them in loop then it will show me
									//and for whole, firstly it will go out of loop
					
					
					min=a[i][j];
					
					//System.out.println(min);  //print here to get all no less than 2 bcoz of loop
				}
				
			}
		}
			System.out.println(min);
		
		
		
	}

}
