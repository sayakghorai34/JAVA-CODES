
public class P3 {
	public static void main(String[] args) {
		String str1=new String("Manish");
		String str2=new String("Manish");
		if(str1==str2)
			System.out.println("Equal references");
		else
			System.out.println("Not Equal references");
		
		if(str1.equals(str2))
			System.out.println("Equal object");
		else
			System.out.println("Not Equal object");
	}
}
