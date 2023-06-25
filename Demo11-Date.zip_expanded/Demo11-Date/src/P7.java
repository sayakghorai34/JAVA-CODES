import java.text.SimpleDateFormat;
import java.util.*;

public class P7 {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(new Date());
		System.out.println(str);
	}
}
