package p6;

import java.util.Set;
import java.util.TreeSet;

import p4.Student;

public class P1 {
public static void main(String[] args) {
	Set<Student> set=new TreeSet();
	set.add(new Student(3,"Sayak",22));
	set.add(new Student(2,"Yash",31));
	set.add(new Student(1,"Adarsh",20));
	set.add(new Student(4,"Yogesh",25));
	for(Student s:set) {
		System.out.println(s);
	}
}
}
