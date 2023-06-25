import java.util.Scanner;

public class Q4 {
	int fact(int num) {
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		Q4 obj=new Q4();
		int res=obj.fact(num);
		System.out.println("Result = "+res);
	}
}
