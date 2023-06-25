package sumusingmethood;

import java.util.Scanner;

public class summethood {
	int SumTill(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input range: ");
		int num=sc.nextInt();
		summethood obj=new summethood();
		System.out.println("Sum of first "+num+" is: "+obj.SumTill(num));
		
	}
}
