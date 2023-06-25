import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * methood1
		int []arr=new int[5];

		arr[0]=3;
		arr[1]=2;
		arr[2]=4;    /we can use this type or
		arr[3]=6;
		arr[4]=5;
		*/
		
		/*methood2
		int [] arr= {3,2,4,6,5};
		*/
		
		int []arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=9;i++) {
			System.out.println("enter num: ");
			arr[i]=sc.nextInt();
		}
		System.out.println(arr);
		
	}
	

}
