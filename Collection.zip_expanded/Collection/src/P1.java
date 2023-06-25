import java.util.ArrayList;
import java.util.List;

public class P1 {
public static void main(String[] args) {
	List ls=new ArrayList();
	System.out.println(ls.size());
	System.out.println(ls.isEmpty());
	
	ls.add("Manan");
	System.out.println(ls.isEmpty());
	ls.add("Pareek");
	ls.add(12);
	ls.add(2.3);
	//Student s=new Student(12,"Megha");
	ls.add(new Student(12,"Megha"));
	System.out.println(ls.get(4));
	int num=(int)ls.get(2);
	System.out.println(num);
	Student sd=(Student)ls.get(4);
	System.out.println(sd);
	System.out.println(ls);
	ls.add("Manan");
	System.out.println(ls);
	System.out.println(ls.size());
	ls.remove(2.3);
	System.out.println(ls);
	ls.remove("Manan");
	System.out.println(ls);
	System.out.println(ls.size());
	//System.out.println(ls.contains());
	
	
	
}
}
