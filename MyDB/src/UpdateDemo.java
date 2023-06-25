import java.sql.*;
import java.util.Scanner;
public class UpdateDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Id : ");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.print("Enter Name : ");
	String name=sc.nextLine();
	System.out.print("Enter Age : ");
	int age=sc.nextInt();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NU18","root","root");
		Statement stmt=con.createStatement();
		String query="Update student set stname='"
				+name+"',stage="+age+" where stid="+id;
		System.out.println(query);
		stmt.executeUpdate(query);
		System.out.println("Record Updated");
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
