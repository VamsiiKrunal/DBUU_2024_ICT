//package jdbc_dbuu.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.util.Scanner;
//
//public class Dynamic {
//
//	public static void main(String[] args) {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url="jdbc:mysql://localhost:3306/jdbc_demo";
//	Connection con=	DriverManager.getConnection(url,"root","root");
//		
//	
//	String query="insert into sampletable(id,name  ) values(?,?)";
//   PreparedStatement ps	=con.prepareStatement(query);
//   
//   Scanner scanner=new Scanner(System.in);
//   
//   System.out.println("enter your name");
//     String name =scanner.nextLine();
//     
//     System.out.println("enter your id");
//     int id =scanner.nextInt();
//     
//   ps.setInt(1,id);
//   ps.setString(2,name);
//   ps.executeUpdate();
//	} catch (Exception e) {
//		System.out.println(e.getMessage());
//	}
//	}
//
//}
