import java.util.ArrayList;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		List ls=new ArrayList();
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		ls.add("Tanmay");
		ls.add("Nitin");
		ls.add(23);
		ls.add(3.4);
		//Student s=new Student(2,"Anil");
		ls.add(new Student(2,"Anil"));
		ls.add("Nitin");
		System.out.println(ls.size());
		System.out.println(ls);
		ls.remove("Nitin");
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		System.out.println(ls.get(3));
		int num=(int)ls.get(1);
		System.out.println(num);
		Student sd=(Student)ls.get(3);
		System.out.println(sd);
		System.out.println(ls.contains("Manish"));
		
	}
}
