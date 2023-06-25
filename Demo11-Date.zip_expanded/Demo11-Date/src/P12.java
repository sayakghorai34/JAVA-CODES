import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P12 {
	public static void main(String[] args) {
		System.out.print("Enter DOB : ");
		Scanner sc = new Scanner(System.in);
		String strDOB = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date d1 = null;
		Date today = new Date();
		try {
			d1 = sdf.parse(strDOB);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long start = d1.getTime();
		long end = today.getTime();
		
		long result = end - start;
		
		double years = (double) result / 1000;
		years=(double)years/(60*60);
		years=(double)years/24;
		years=(double)years/365;
		
		System.out.println(years);

	}
}
