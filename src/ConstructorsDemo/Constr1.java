package ConstructorsDemo;

public class Constr1 {

	public Constr1(){
		
		System.out.println("Constructor is invoked at a time of object invocation");
	}

	
	public Constr1(int a, int b){
		int c=a+b;
		System.out.println("Parameterized Constructor with 4 and 5");
		System.out.println(c);
	}
	
	public Constr1(String str){
		
		System.out.println(str);
	}

	
	
	public static void main(String[] args) {

		Constr1 c=new Constr1();
	//when u create an object constructor is called and all variables will get initialised
		Constr1 c1=new Constr1(4,5);
		Constr1 c2=new Constr1("hello");
	}

}
