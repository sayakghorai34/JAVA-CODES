import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];                    //we can use sorting technique
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=9;i++) {
			System.out.println("Enter Num ");
			arr[i]=sc.nextInt();
		}
		/*
		int great=arr[0];
		for(int i=0;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(arr[i]<arr[j])
					great=arr[j];
			}
		}
		System.out.println("greatest is: "+great);      //Something's wrong
		*/
		for(int l=0;l<10;l++) {
		for(int i=0;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
}