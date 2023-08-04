package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDTableDynamicInput {
    public static void main(String[] args) {
    	try {
   		 Class.forName("com.mysql.cj.jdbc.Driver");
   		  String url="jdbc:mysql://localhost:3306/Rohan";
   	         String username="root";
   	         String password="root";
   	         Connection con=DriverManager.getConnection(url,username,password);
   	         String q="insert into table1(tname,tcity) values (?,?)";
   	         PreparedStatement pstmt=con.prepareStatement(q);
   	         Scanner sc=new Scanner(System.in);
   	         String Name,City;
   	         System.out.println("Enter Name");
   	         Name=sc.next();
   	         System.out.println("Enter Name");
	         City=sc.next();      
   	         pstmt.setString(1, Name);
   	         pstmt.setString(2, City);
   	         pstmt.executeUpdate();
   	         System.out.println("values Inserted");
   	         con.close();
   	}
   	catch(Exception e) {
   		System.out.println(e);
   	}
	}
}
