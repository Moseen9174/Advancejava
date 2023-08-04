package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UseResultSetObj {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance1","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from emp1");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
