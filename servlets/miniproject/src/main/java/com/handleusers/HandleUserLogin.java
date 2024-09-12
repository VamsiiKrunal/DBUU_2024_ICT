package com.handleusers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class HandleUserLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException {
		String form_username=req.getParameter("username");
		String form_password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		try {
			//step1 loaad driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2 connect
			String url="jdbc:mysql://localhost:3306/store_users";
			
			Connection con=DriverManager.getConnection(url,"root","root");
			String selectuser="SELECT * FROM users where username=? AND password=?";
			
			PreparedStatement ps=con.prepareStatement(selectuser);
			ps.setString(1, form_username);
			ps.setString(2,form_password);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				out.print("Login successful");
			}
			else {
				out.print("Login  unsuccessful");

			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
