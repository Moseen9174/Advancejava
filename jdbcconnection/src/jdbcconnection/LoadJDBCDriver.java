package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoadJDBCDriver {
  public static void main(String[] args) {
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  String url="jdbc:mysql://localhost:3306/rahul";
	         String username="root";
	         String password="root";
	         Connection con=DriverManager.getConnection(url,username,password);
	         if(con.isClosed()) {
	        	 System.out.println("connection faield");
	         }
	         else {
	        	 System.out.println("connection created");
	         }
	  }
	  catch(Exception e){
		  System.out.println(e);
	  }
  }
}
