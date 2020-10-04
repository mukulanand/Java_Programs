
public class ArgumentDemo {
	
	public void add(int a, float b){
		float c=a+b;
		System.out.println(c);
		
	}
		public static void main(String[] args) {
		ArgumentDemo ad=new ArgumentDemo();
		int a=6;
		float b=4.50f;
		ad.add(a, b);
		ad.add(4, 5.20f);
	}

}
