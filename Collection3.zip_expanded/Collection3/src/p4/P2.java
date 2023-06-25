package p4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2 {
public static void main(String[] args) {
	List<Student> ls=new ArrayList();
	ls.add(new Student(3,"Sayak",22));
	ls.add(new Student(2,"Yash",31));
	ls.add(new Student(1,"Adarsh",20));
	ls.add(new Student(4,"Yogesh",25));
	//System.out.println(ls);
	AgeSort age=new AgeSort();
	Collections.sort(ls,age);
	//System.out.println(ls);
	for(Student st:ls)
	{
		System.out.println(st);
	}
	System.out.println();
	NameSort ns=new NameSort();
	Collections.sort(ls,ns);
	for(Student st:ls)
	{
		System.out.println(st);
	}
	System.out.println();
	IdSort id=new IdSort();
	Collections.sort(ls,id);
	for(Student st:ls)
	{
		System.out.println(st);
	}
}
}
