
/*public class ThisMethod {
	int a;
	public void no (int a){
		
		System.out.println(this.a);  //this is for instance variable
		System.out.println(a);  //this is for local variable
	}
	
	
	public static void main(String[] args) {
		ThisMethod tm=new ThisMethod();
		tm.no(5);
		
		
		
	}

}*/

	public class ThisMethod {
		
		public void a(){
			System.out.println("world");
		}
		
		public void m(){
			System.out.println("Hello m");
		}
	
		public void n(){
			System.out.println("Hello n");
			m();  //if I will not put this keyword here, the compiler will automatically put this keyword
			//or this.m();
			a(); //same here the compiler put this keyword
		}
	
		public static void main(String[] args) {
			ThisMethod tm=new ThisMethod();
				tm.n();
	}
}