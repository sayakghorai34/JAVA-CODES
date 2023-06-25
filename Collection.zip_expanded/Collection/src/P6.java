import java.util.Hashtable;
import java.util.Map;

public class P6 {
public static void main(String[] args) {
	Map m=new Hashtable();
	m.put(2,"Abhiraj");
	m.put("Sidd","Manish");
	m.put(1,new Student(23,"Naveen"));
	String name=(String)m.get("Sidd");
	System.out.println(name);
	System.out.println(m);
	System.out.println(m.entrySet());
	System.out.println(m.keySet());
	System.out.println(m.values());
	
}
}
