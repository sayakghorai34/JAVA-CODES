
public class P2 {
	public static void main(String[] args) {
		String str1="Manish";
		String str2="Manish";
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
