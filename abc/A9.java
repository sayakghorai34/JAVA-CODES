import java.util.Scanner;

public class A9 {
	public static void main(String[] args) {
		int []arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter number "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);

	}
}
