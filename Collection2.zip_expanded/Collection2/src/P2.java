import java.util.*;

public class P2 {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("Suhani");
		s.add("Shruti");
		s.add(123);
		s.add(2.34);
		//Student sd=new Student(56,"Samyak");
		s.add(new Student(56,"Samyak"));
		s.add("Suhani");
		System.out.println(s);
		s.remove("Suhani");
		System.out.println(s);
		s.add(new Student(56,"Samyak"));
		System.out.println(s);
		s.remove(new Student(56,"Samyak"));
		System.out.println(s);
	}
}
