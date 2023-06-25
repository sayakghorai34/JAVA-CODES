
public class P4 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Manish");
	System.out.println(sb);
	sb.append('a');
	System.out.println(sb);
	sb.replace(2,4,"zzzz");
	System.out.println(sb);
	sb.delete(2, 5);
	System.out.println(sb);
}
}
