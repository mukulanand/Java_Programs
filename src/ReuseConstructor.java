//constructor chaining or reuse constructor

public class ReuseConstructor {

	int no;
	String name, course;
	float fee;
	
	ReuseConstructor(int no, String name, String course){
		this.no=no;
		this.name=name;
		this.course=course;		
	}
	
	ReuseConstructor(int no, String name, String course, float fee){  //here I am reusing the constructor with new value fee
		this(no, name, course );  //call this() must be the first statement in the cons so we call the cons method first otherwise we will get error
		this.fee=fee;		
	}
	
	void display(){
		System.out.println(no+" "+name+" "+course+" "+fee);
	}
	
	
	public static void main(String[] args) {
		ReuseConstructor rc=new ReuseConstructor(15, "mukul", "BCA");
		ReuseConstructor rc1=new ReuseConstructor(15, "anand", "MCA", 400f);
		rc.display();
		rc1.display();
	}

}
