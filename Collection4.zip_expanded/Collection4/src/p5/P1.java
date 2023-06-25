package p5;

import java.util.Set;
import java.util.TreeSet;

public class P1 {
public static void main(String[] args) {
	Set<String> set=new TreeSet<String>();
	set.add("Rishabh");
	set.add("Abhiraj");
	set.add("Mehak");
	set.add("Ansh");
	set.add("Amit");
	//System.out.println(set);
	for(String s:set) {
		System.out.println(s);
	}
}
}
