package com.san.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.san.bean.Productbean;

public class ValidateLoginController extends HttpServlet{
	
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		if(uname.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
			
		{
			
			//response.sendRedirect("/WEB-INF/jsp/home.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
			dispatcher.forward(request, response);
			
		}
		else
		{
			//response.sendRedirect("error.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
			
		}
		
		
	}
		
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			processRequest(request, response);
			
		
			
			
			}
			
		
			
			
		
		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request, response);
		}

}
