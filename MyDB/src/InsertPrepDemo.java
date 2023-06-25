import java.sql.*;
import java.util.Scanner;
public class InsertPrepDemo {
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
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NU18","root","root");
		System.out.println("Created connection");
		String query="Insert into student values(?,?,?)";
		
		System.out.println(query);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.executeUpdate();
		System.out.println("Record Stored");
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
