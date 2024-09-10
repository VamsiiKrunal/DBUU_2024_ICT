package jdbc_dbuu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateQuery {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc_demo";
	Connection con=	DriverManager.getConnection(url,"root","root");
		
	
	String query="update sampletable set name=? where id=?";
   PreparedStatement ps	=con.prepareStatement(query);
   ps.setString(1,"vardhaumar");
   ps.setInt(2,300);
   int output=  ps.executeUpdate();
   if (output==1) {
	System.out.println("sucess");
   }
   
   con.close();

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
