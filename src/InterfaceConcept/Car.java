package InterfaceConcept;

public class Car implements Boy {
	public static void main(String[] args) {
		Car c=new Car();
		c.Banking();
		c.Finance();
		c.Medical();
		c.IT();
		
		Boy b=new Car();
		b.Banking();
		b.IT();
		b.Medical();

		
	}

	public void Banking() {
		// TODO Auto-generated method stub
		
	}

	public void IT() {
		// TODO Auto-generated method stub
		
	}

	public void Medical() {
		// TODO Auto-generated method stub
		
	}

	public void Finance() {
		// TODO Auto-generated method stub
		
	}


}
