import java.sql.*;
import java.util.Scanner;
public class DeletePrepDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Id : ");
	int id=sc.nextInt();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NU18","root","root");
		String query="Delete from student where stid=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Record Deleted");
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
