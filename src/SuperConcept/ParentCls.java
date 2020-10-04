package SuperConcept;

public class ParentCls {
	
	String name="Mukul";
	
	public void StringValue(){
		System.out.println(name);
		
	}
	
	
	public void man(){
		
		System.out.println("My name is man in parent");
	}

	
	public static void main(String[] args) {
		ParentCls pc=new ParentCls(); 
		pc.man();
		pc.StringValue();
	}

}
