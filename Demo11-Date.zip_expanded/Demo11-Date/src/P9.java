import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class P9 {
	public static void main(String[] args) {
		Calendar c=new GregorianCalendar(2013,11,24);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
	}
}
