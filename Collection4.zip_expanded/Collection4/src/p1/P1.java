package p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1 {
public static void main(String[] args) {
	List<String> ls=new ArrayList<String>();
	ls.add("Rishabh");
	ls.add("Abhiraj");
	ls.add("Mehak");
	ls.add("Ansh");
	System.out.println(ls);
	Collections.sort(ls);
	System.out.println(ls);
}
}
