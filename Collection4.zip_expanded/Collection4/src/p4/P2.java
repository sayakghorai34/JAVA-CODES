package p4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2 {
public static void main(String[] args) {
	List<Student> ls=new ArrayList();
	ls.add(new Student(3,"Rishabh",24));
	ls.add(new Student(2,"Abhiraj",21));
	ls.add(new Student(1,"Mehak",23));
	ls.add(new Student(4,"Ansh",19));
	//System.out.println(ls);
	IdComp ic=new IdComp();
	Collections.sort(ls,ic);
	//System.out.println(ls);
	for(Student s:ls) {
		System.out.println(s);
	}
	System.out.println();
	NameComp nc=new NameComp();
	Collections.sort(ls,nc);
	//System.out.println(ls);
	for(Student s:ls) {
		System.out.println(s);
	}
	System.out.println();
	AgeComp ac=new AgeComp();
	Collections.sort(ls,ac);
	//System.out.println(ls);
	for(Student s:ls) {
		System.out.println(s);
	}
}
}
