import java.util.Scanner;

public class A3 {
	int prod(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num1: ");
		int n1=sc.nextInt();
		System.out.print("Enter num2: ");
		int n2=sc.nextInt();
		A3 obj=new A3();
		System.out.println(obj.prod(n1, n2));
	}
}
