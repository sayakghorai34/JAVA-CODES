import java.util.*;

public class P2 {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add("Jatin Joshi");
	s.add(12);
	s.add(8.99);
	s.add("Jatin Joshi");
	s.add("Rachit");
	s.add(new Student(13,"Rishabh Gupta"));
	System.out.println(s);
	s.add("Jatin Joshi");
	System.out.println(s);
	s.add(new Student(13,"Rishabh Gupta"));
	System.out.println(s);
	//s.add(new Student(14,"Rishabh Gupta"));
	//System.out.println(s);
	s.remove(8.99);
	System.out.println(s);
	System.out.println(s.size());
	System.out.println(s.isEmpty());
	System.out.println(s.contains("Jatin Joshi"));
	
}
}
