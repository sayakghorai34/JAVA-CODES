package p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class P2 {
public static void main(String[] args) {
	Set<Student> set=new TreeSet<Student>();
	set.add(new Student(3,"Rishabh",24));
	set.add(new Student(2,"Abhiraj",21));
	set.add(new Student(1,"Mehak",23));
	set.add(new Student(4,"Ansh",19));
	for(Student s:set) {
		System.out.println(s);
	}
}
}
