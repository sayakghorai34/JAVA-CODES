import java.util.*;

public class P5 {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("Suhani");
		s.add("Shruti");
		s.add(123);
		s.add(2.34);
		//Student sd=new Student(56,"Samyak");
		s.add(new Student(56,"Samyak"));
		
		for(Object obj:s) {
			System.out.println(obj);
		}
	}
}
