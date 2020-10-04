
public class ThisDemo {
	
	int a=2;
			
	public void getData(){
		int a=3;
		int b=this.a+a;
		System.out.println(a);  //this is for local variable
		System.out.println(this.a);  //this always refer to the instance variable
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		ThisDemo td=new ThisDemo();
		td.getData();
	}

}
