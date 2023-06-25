import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P5 {
	public static void main(String[] args) {
		List<String> ls = new ArrayList();
		ls.add("Manan");
		ls.add("Pareek");
		//ls.add(12);
		//ls.add(34.5);
		ls.add("Manan");
		//ls.add(new Student(1,"Pareek"));
		//System.out.println(ls);
		int num=1;
//		Iterator it=ls.iterator();
//		while(it.hasNext()) {
//			System.out.println(num+". "+it.next());
//			num++;
//		}
		for(String obj:ls) {
			System.out.println(num+". "+obj);
			num++;
		}
		String str=ls.get(1);
		System.out.println(str);
	}
}
