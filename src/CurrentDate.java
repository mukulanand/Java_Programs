import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentDate {
	public static void main(String[] args) {
			Date d=new Date();
			System.out.println(d.toString());
			
			//now we will get date in specific format
			SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  //sdf will automatically convert in to the desired format in the mentioned as the argument
			System.out.println(sdf.format(d));
	}

}
