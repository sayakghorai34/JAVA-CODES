import java.util.Random;
import java.util.Scanner;

public class Account {
	private float Balance;
	private int PIN;
	private long PhNo;
	private String Name;
	private Scanner sc;
	Account(String name,float balance,long phNO,int Pin){
		if(balance>0) {
			Name=name;
			Balance=balance ;
			PIN=Pin;
			PhNo=phNO;
		}
	}
	
	public boolean Authenticate(int pin) {
		if (pin==PIN) {
			return true;
		}
		else
		return false;
	}
	public void checkBalance(int pin) {
		if (Authenticate(pin)) {
			System.out.println("Hello "+getName()+" ,Your Current Balance is: "+Balance);
		}
		else 
			System.out.println("!!!PIN Authentication Failed!!!!");
	}
 	public String getName() {
		return Name;
	}
	public void setName(String name,int Pin) {
		if(Authenticate(Pin)){
			Name=name;
			System.out.println("Account Name Changed To: "+Name+" Successfully");
		}
		else
			System.out.println("!!!Authentication Failed!!!");
	}
	public void Deposit(float amount) {
		if(amount>0) {
			Balance+=amount;
			System.out.println(amount+" Deposited Successfully");
		}
		else
			System.out.println("!!!Deposit Amount Invalid!!!");
	}
	public void Withdraw(float amount,int Pin) {
		if(Authenticate(Pin) && amount<=Balance) {
			Balance-=amount;
			System.out.println("Withdrawl of"+amount+" was Successful:-)");
		}
		else
			System.out.println("!!!Authentication Failed!!!");
	}

	private int getOTP() {
			Random rand=new Random();
			return rand.nextInt(9999 - 1000) + 1000;	
	}
	public void resetPIN(long ph,int newPIN) {
		if(ph==PhNo) {
			int otp=getOTP();
			System.out.println("OTP is: "+otp);
			sc = new Scanner(System.in);
			System.out.print("Enter OTP: ");
			int userInput=sc.nextInt();
			if(otp==userInput) {
				PIN=newPIN;
				System.out.println("PIN Changed Successfully");
			}
			else {
				System.out.println("!!!Invalid OTP!!!");
		
			}
		}
		else
			System.out.println("!!!Phone Number Didn't Match");
	}
}

