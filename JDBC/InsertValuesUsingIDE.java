package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertValuesUsingIDE {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance1","root","root");
			String q="insert into emp3(name,surname)values('Rahul','Soni')";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Task Complete");
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
