import java.sql.*;
import java.util.Scanner;
public class SelectDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Id : ");
	int id=sc.nextInt();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NU18","root","root");
		Statement stmt=con.createStatement();
		String query="Select * from student where stid="+id;
		System.out.println(query);
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
			System.out.println(rs.getString(1)+
					" "+rs.getString(2)+" "
					+rs.getString(3));
				
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
