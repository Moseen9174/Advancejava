package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertValuesTableUseIDE {
	 public static void main(String[] args) {
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  String url="jdbc:mysql://localhost:3306/rahul";
		         String username="root";
		         String password="root";
		         Connection con=DriverManager.getConnection(url,username,password);
		         Statement st=con.createStatement();
		         String q="insert values sohan1(raj,123)";
		         int i=st.executeUpdate(q);
		         if(i==1) {
		        	 System.out.println("Data Inserted Sucssesfully");
		         }
		         else {
		        	 System.out.println("Data not Inserted");
		         }
		         con.close();
		  }
		  catch(Exception e){
			  System.out.println(e);
		  }
	  }
}
