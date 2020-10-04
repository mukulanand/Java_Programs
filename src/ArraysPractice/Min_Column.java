package ArraysPractice;

public class Min_Column {
	public static void main(String[] args) {
			int a[][]={{1,2,0},{4,5,6},{2,10,8}};
			int min=a[0][0];
			int getCol=0;
			
			for(int i=0;i<3;i++){
				
				for(int j=0;j<3;j++){
				
					if(a[i][j]<min){
						min=a[i][j];
						getCol=j;
					}	
															
				}
							
			}
			System.out.println("Minimum no is " + min);			
			int MaxCol=a[0][getCol];
			int k=0;
			while(k<3){
				if(a[k][getCol]>MaxCol){
				MaxCol=a[k][getCol];
				
			}
			
				k++;		
				
	}
			System.out.println("maximum no in min column is "+ MaxCol);
}
	
}