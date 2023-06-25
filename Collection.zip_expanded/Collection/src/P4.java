import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P4 {
	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Manan");
		ls.add("Pareek");
		ls.add("Manan");
		ls.add(new Student(1,"Pareek"));
		//System.out.println(ls);
		int num=1;
//		Iterator it=ls.iterator();
//		while(it.hasNext()) {
//			System.out.println(num+". "+it.next());
//			num++;
//		}
		for(Object obj:ls) {
			System.out.println(num+". "+obj);
			num++;
		}
	}
}
