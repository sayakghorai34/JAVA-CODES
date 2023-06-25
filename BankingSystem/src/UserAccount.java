import java.util.Scanner;

public class UserAccount {

	private static Scanner sc;

	public static void main(String[] args) {
		//~~~~~~~~~~~~~Create Account Object~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Base Amount: ");
		int base=sc.nextInt();
		System.out.println("Enter Phone Number: ");
		long phNo=sc.nextLong();
		System.out.println("Enter Your Secure Custom PIN: ");
		Account p1=new Account(name,base,phNo,sc.nextInt());
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		
		
		//Deposit Balance>>>>>
		System.out.println("Enter Deposit Amount: ");
		p1.Deposit(sc.nextFloat());
		//check Balance
		System.out.println("Enter PIN to get balance: ");
		p1.checkBalance(sc.nextInt());
		
		//Withdraw Balance>>>>>
		System.out.println("ENter Withdrawl Amount: ");
		float with=sc.nextFloat();
		System.out.println("Enter PIN for Withdrawl: ");
		int pin=sc.nextInt();
		p1.Withdraw(with, pin);
		//check Balance
		System.out.println("Enter PIN to get balance: "); //Check Balance
		p1.checkBalance(sc.nextInt());
		
		//Reset PIN
		System.out.println("Enter Phone Number to Reset PIN: ");
		long num=sc.nextLong();
		System.out.println("Enter new PIN: ");
		p1.resetPIN(num, sc.nextInt());
		
		//Correct Name
		System.out.println("Enter New Name: ");
		String nName=sc.nextLine();
		System.out.println("Enter Your PIN: ");
		p1.setName(nName, sc.nextInt());
		}
	}

