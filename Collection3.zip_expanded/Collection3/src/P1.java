import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1 {
public static void main(String[] args) {
	List<String> ls=new ArrayList<String>();
	ls.add("Sayak");
	ls.add("Rohith");
	ls.add("Sapna");
	ls.add("Aman");
	System.out.println(ls);
	Collections.sort(ls);
	System.out.println(ls);
}
}
