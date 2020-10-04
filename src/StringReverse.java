
public class StringReverse {

	public static void main(String[] args) {
			String s="Madam";   //length of s=5, but loop length is from 0 to 4 so we need to subtract 1 from string length
 			//System.out.println(s.length());
			String t="";
			for(int i=s.length()-1;i>=0;i--){				
				t=t+s.charAt(i);
				
			}
				System.out.println("The reverse of the string is " + t);
				if(s.equalsIgnoreCase(t)){
					System.out.println("the string is palindrome");					
				}
	
				else {
				 	
				System.out.println("not Palindrome");
				
			}								
				
		}				
}
				
	


