import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class P8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/M/yyyy");
		try {
			Date d=sdf.parse(str);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
