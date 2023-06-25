//charAt,indexOf,length, equals,equalIgnoreCase,compareTo
//substring
public class A5 {
public static void main(String[] args) {
	String name="Manish Hurkat";
	System.out.println(name.charAt(4));
	System.out.println(name.length());
	System.out.println(name.indexOf('k'));
	String n1="Manish";
	String n2="Manish";
	if(n1.compareTo(n2)==0) {
		System.out.println("Equal string");
	}
	System.out.println(n1.substring(2,5));
	System.out.println(name.substring(2));
	//System.out.println(n1.);
}
}
