import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P3 {
public static void main(String[] args) {
	List<Student> ls=new ArrayList();
	ls.add(new Student(3,"Sayak",22));
	ls.add(new Student(2,"Yash",31));
	ls.add(new Student(1,"Adarsh",20));
	ls.add(new Student(4,"Yogesh",25));
	System.out.println(ls);
	Collections.sort(ls);
	System.out.println(ls);
}
}
