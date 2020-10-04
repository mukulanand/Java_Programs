package SuperConcept;

public class Childcls extends ParentCls{
	
	String name="Anand";
	
	public void StringValue(){
		System.out.println(name);
		System.out.println(super.name);
	}

	public void man(){
		super.man();
		System.out.println("My name is man in child");
	}
	
	
	
	public static void main(String[] args) {
	Childcls ch=new Childcls();
	ch.man();
	ch.StringValue();
	
	}

}
