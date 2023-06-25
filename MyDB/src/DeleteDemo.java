import java.sql.*;
import java.util.Scanner;
public class DeleteDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Id : ");
	int id=sc.nextInt();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","root","Sayak@123123");
		Statement stmt=con.createStatement();
		String query="Delete from new_table where ID="+id;
		System.out.println(query);
		stmt.executeUpdate(query);
		System.out.println("Record Deleted");
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
