package stringMethoods;

import java.util.Scanner;

public class rev {
	String Reverse(String Str) {
		String helper="";
		for(int i=Str.length()-1;i>=0;i--) {
			helper+=Str.charAt(i);
		}
		return helper;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		rev obj=new rev();
		System.out.println("Reverse of name is: "+obj.Reverse(sc.nextLine()));
		
	}

}




