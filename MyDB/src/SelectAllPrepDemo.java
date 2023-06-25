import java.sql.*;
import java.util.Scanner;
public class SelectAllPrepDemo {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/NU18","root","root");
		String query="Select * from student ";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt(1)+" "
					+rs.getString(2)+" "+rs.getInt(3));
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
