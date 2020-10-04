
public class String_practice {
	public static void main(String[] args) {

		/**String str="payment $100 paid";
		System.out.println(str.charAt(8));
		System.out.println(str.substring(8));
		System.out.println(str.indexOf("$")); **/
		
		
		
		/**String s="Mukul";
		String t="";
		for(int i=s.length()-1;i>=0;i--){
			t=t+s.charAt(i);
	
		}
		
		System.out.println(t+" the string is reversed ");  **/
		

/**		//Ques-1-->> How memory is allocated to String literals and String class object. See the example below
		
		String a="Hello";  //the way of defining string is called string literals
		String b="Hello"; //In the case of literals, this hello will not be created in memory becoz the hello
						//is already created by varibale a and it will be search in the memory first if the same value is created or not
						//hence the b will point to the hello created by variable a.
		String s=new String("Hello");//simply creating an object of string
		String t=new String("Hello");//but here u can create multiple same values by using different variables
		
		//that the only difference between them   **/
	
	
	/** Ques-2-->>Why strings are immutable? (immutable-which cant be altered or changed)
	   Ans: see the example below  
	
		String a="Hello";
		//String a="Hello world";
		String b="Hello";
		a.concat("World");
		System.out.println(a); //when u print a, the result will be only hello, becoz we cant alter the original value of string a.
							   // b is also pointing the same to the original value "hello "hold by a. If I change the value of a from hello to 
		//hello world. b's value will not be change. So to to get rid of this pronlem the java developer makes the string class immutable
		//System.out.println(b);
		//so If i want to concatenate variable a with value world I need to declare another string to hold it
		//so that to avoid changing the original value, which cant be happened bcoz of immutable nature of string
		String c=a.concat("World");
		System.out.println(c);
	
	Interview ques-2--> the interviewer will create the five string with the same value and ask how many objects memory wil be created
	ans->>only 1    **/
	
		
		/** Interview ques-3-->If string is immutable then how will u work by modifying the original string?
		//Ans:-->By using string buffer and string builder class(both are mutable or can be altered). Both classes are same but there is a difference
		 in synchronization.  **/
		 
		  //1. Example of-->Stringbuffer
		  
	/**	  StringBuffer sb=new StringBuffer("I Love");
		  sb.append("India");  //append is the method which will append to the existing value like hello
		  System.out.println(sb);
		  sb.insert(6, "my");
		  System.out.println(sb);
		  sb.replace(6, 8, "mi");
		  System.out.println(sb);  //spaces are also counted
		  sb.deleteCharAt(12);
		  System.out.println(sb);
		  sb.reverse();   //you can also reverse the string by stringbuffer class "reverse" method
		  System.out.println(sb);    
		  
		//String builder is not thread safe and it is non synchronized
	
		//we are working with stringbuffer, and also with its sb object which is performing different threads
		//or execute different methods, so, the stringbuffer will not allow to execute the another thread to execute until or unless
		//the prior one will finished its task completely thats y it is thread safe and synchronized bcoz it controls the parallel thread synchronization.
		//but stringbuilder is not thread safe. it allows the threads to runs at a time and therefore it is faster than stringbuffer. and its useful in sequential
		//execution of thread. but not in parallel execution.
		//StringBuilder has also the same methods as stringbuffer class  **/
	
	
		//Interview ques-4--> When to use (==) and equals method to compare the strings
		
					String a="Hello";	
					String b="Hello";
					System.out.println(a.equals(b));  //this method will comapre the contents present in the variable such as hello
								//so it will return true
	
					System.out.println((a==b)); //It will compare the object reference for which they are refering to. 
												//It will also return true bcoz both a&b are refering to the hello
												//present in a
	
					String s=new String("Hello");
					String s1=new String("Hello");
				
					System.out.println((a.equals(s))); //this will return true bcoz equals method blindly compare the content
					System.out.println(a==s);  //this will return false bcoz both a & s are refering to different objects
		 					
					System.out.println((s.equals(s1)));  //true, bcoz contents are same
					System.out.println(s==s1); //false bcoz both s and s1 are refering to different object.
					
					System.out.println(s.equalsIgnoreCase(s1)); //equalignorecase will dont mind the cases whEther THE CASES ARE UPPER OR LOWER
																//so it will return true here
					
					
					
	}

}  
