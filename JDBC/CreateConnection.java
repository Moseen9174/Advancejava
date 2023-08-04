package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moseen","root","root");
			if(con.isClosed()) {
				System.out.println("connection faield");
			}
			else {
				System.out.println("connection create succesfully");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
