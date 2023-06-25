import java.sql.*;
import java.util.Scanner;
public class InsertDemo {
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
		System.out.println("Driver Uploaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","root","Sayak@123123");
		System.out.println("Created connection");
		Statement stmt=con.createStatement();
		String query="Insert into new_table values("+
				id+",'"+name+"',"+age+")";
		System.out.println(query);
		stmt.executeUpdate(query);
		System.out.println("Record Stored");
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
