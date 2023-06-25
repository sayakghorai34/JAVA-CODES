import java.util.Scanner;

public class Q9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []num=new int[10];
	for (int i = 0; i < num.length; i++) {
		System.out.print("Eneter number "+(i+1)+": ");
		num[i]=sc.nextInt();
	}
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
}
}
