import java.sql.*;
import java.util.Scanner;
public class UpdatePrepDemo {
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
		String query="Update student set stname=?,stage=? where stid=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setInt(3, id);
		ps.executeUpdate();
		System.out.println("Record Updated");
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
