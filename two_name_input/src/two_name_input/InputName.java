package two_name_input;

import java.util.Scanner;

public class InputName {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Name1: ");
		String name1=sc.nextLine();
		System.out.print("Enter Name2: ");
		String name2=sc.nextLine();
		System.out.println("First Name: "+name1+" ; Second Name: "+name2);
	}

}
