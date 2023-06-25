//charAt,indexOf,length,equals,equalIgnoreCase,
//compareTo,substring
public class Q5 {
	public static void main(String[] args) {
		String name1="Manish";
		String name2="manish";
		
		System.out.println(name1.charAt(2));
		System.out.println(name1.length());
		System.out.println(name1.indexOf('H'));
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.toLowerCase());
		if(name1.compareTo(name2)==0)
		{
			System.out.println("Equal Strings");
		}
		else
		{
			System.out.println("not equal");
		}
		System.out.println(name1.substring(2,5));
		System.out.println(name1.substring(2));
	}
}
