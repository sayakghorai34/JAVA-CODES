import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner tinku=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=tinku.nextInt();
		System.out.println("Chal pada");
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
