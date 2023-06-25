
public class P2a {
	public static void main(String[] args) {
		String str1="Manish";
		String str2="Manish";
		if(str1==str2)
			System.out.println("Equal references");
		else
			System.out.println("Not Equal references");
		str2="Abc";
		System.out.println(str1);
		System.out.println(str2);
	}
}
