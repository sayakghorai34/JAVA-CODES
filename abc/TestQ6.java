import java.util.Scanner;

public class TestQ6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		Q6 obj=new Q6();
		String data=obj.reverse(name);
		System.out.println(data);
	}
}
