package TablePrinter;

import java.util.Scanner;

public class TablePrinter {

	public static void main(String[] args) {
		System.out.println("Mission Started (<._.>)!!!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num=sc.nextInt();
		System.out.println("Table of "+num+" is: ");
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"= "+(num*i));
		}
		System.out.println("Mission Successful!! :) !!!!");

	}

}
