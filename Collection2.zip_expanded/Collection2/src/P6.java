import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P6 {
	public static void main(String[] args) {
		List<Student> ls=new ArrayList();
		//ls.add("Tanmay");
		//ls.add("Nitin");
		//ls.add(23);
		//ls.add(3.4);
		//Student s=new Student(2,"Anil");
		ls.add(new Student(2,"Anil"));
		ls.add(new Student(1,"Sunil"));
		Student sd=ls.get(1);
		//ls.add("Nitin");
//		Iterator it=ls.iterator();
//		int num=1;
//		while(it.hasNext()) {
//			System.out.println(num+". "+it.next());
//			num++;
//		}
		for(Student obj:ls) {
			System.out.println(obj);
		}
		
	}
}
