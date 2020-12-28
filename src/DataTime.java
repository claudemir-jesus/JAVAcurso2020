import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		Date s  = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		
		
		
		
		
		
		
		System.out.println(sdf1.format(y1));
		System.out.println(y2);
		System.out.println(sdf2.format(d));
		System.out.print("s: " + s);
		
		
		
		
		
		
		
		
	}

}
