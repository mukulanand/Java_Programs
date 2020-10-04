
public class StaticVar {
	
	String name;
	String address;
	static String city;	
	static int i;
	
	static{
		city="bangalore";
		i=0;
	}
	
	StaticVar(String name, String address){
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	
		public void getAddress(){
			System.out.println(address+" "+city);
		}
		
		//we will see static method
		
		public static void getCity(){
			System.out.println(city);
			
		}
	
	public static void main(String[] args) {
		StaticVar sv=new StaticVar("Bob","Gzb");
		StaticVar sv1=new StaticVar("jara","meerut");
		sv.getAddress();
		sv1.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
		
	}

}
