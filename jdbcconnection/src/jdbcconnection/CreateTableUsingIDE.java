package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTableUsingIDE {
	public static void main(String[] args) {
		 try{
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         String url="jdbc:mysql://localhost:3306/rahul";
	         String username="root";
	         String password="root";
	         Connection con=DriverManager.getConnection(url,username,password);
	         PreparedStatement st=con.prepareStatement("insert into sohan1 (tName,id)values(?,?)");
	         String s = "ray";
	         int u = 123;
	         st.setString(1,"s");
	         st.setInt(2,u);
	        int i = st.executeUpdate();
	        System.out.println(i);
	         con.close();
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	 }
}
