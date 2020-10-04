
 //calling default constructor from parameterized contructor

/*public class ThisConstructor {
	ThisConstructor(){
		System.out.println("Hello a");
	}
	ThisConstructor (int a){
		this();					//here if will not use this(), the parameterized contructor will call only
								//but if I use this(), the default constructor will call first and then
								//param cons will call
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		ThisConstructor tc=new ThisConstructor(10);
		
		
	}

}
*/

//calling parameterized constructor from default contructor

public class ThisConstructor {
	ThisConstructor(){
		this(5);                          //by using this the paramaterize cons will call first and then default will call
		System.out.println("Hello a");  
	}
	ThisConstructor (int a){
		System.out.println(a);	
		
	}
	
	
	public static void main(String[] args) {
		ThisConstructor tc=new ThisConstructor();
		
		
	}

}