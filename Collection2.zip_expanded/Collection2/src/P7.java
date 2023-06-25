import java.util.Hashtable;
import java.util.Map;

public class P7 {
public static void main(String[] args) {
	Map m=new Hashtable();
	m.put(1,"Rohan");
	m.put("chintu",new Student(1,"Syed"));
	m.put(5,"Manish");
	System.out.println(m.get("chintu"));
	Student s=(Student)m.get("chintu");
	System.out.println(m);
	System.out.println(m.entrySet());
	System.out.println(m.values());
	System.out.println(m.keySet());
	
}
}
