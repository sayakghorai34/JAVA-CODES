import java.util.Scanner;

public class A6 {
	String reverse(String name) {
		String result = "";
		for (int i = name.length() - 1; i >= 0; i--)
			result = result + name.charAt(i);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		A6 obj = new A6();
		String res = obj.reverse(name);
		System.out.println(res);
	}
}
