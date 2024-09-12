package com.handleusers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class HandleUserRegister extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException {
		String form_username=req.getParameter("username");
		String form_location=req.getParameter("location");
		String form_password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		try {
			//step1 loaad driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 connect
			String url="jdbc:mysql://localhost:3306/store_users";
			
			Connection con=DriverManager.getConnection(url,"root","root");
			String Insertquery="INSERT INTO users(username,location,password) VALUES (?,?,?)";
			PreparedStatement ps=con.prepareStatement(Insertquery);
			ps.setString(1, form_username);
			ps.setString(2,form_location);
			ps.setString(3,form_password);
			int database_result= ps.executeUpdate();
			if(database_result==1) {
				out.print("user added successfully");
				resp.sendRedirect("login.jsp");
			}
			else {
				out.print("user  unsuccessfully");

			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
