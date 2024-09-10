//package jdbc_dbuu.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class Jdbc_Connection {
//
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("connection successfull");
//			String url="jdbc:mysql://localhost:3306/jdbc_demo";
//			
//			//step2 
//			//create connection object
//		Connection con=	DriverManager.getConnection(url,"root","root");
//			System.out.println("database connected");
//			// steps 3 
//			//create Statement object
//			Statement st=con.createStatement();
//			System.out.println("statement object is created");
//			//step4 
//			//execute query
//			  ResultSet result=  st.executeQuery("select * from sampletable");
//			  while(result.next()) {
//				  System.out.println(result.getInt(1));
//				  System.out.println(result.getString(2));
//			  }
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//
//}
