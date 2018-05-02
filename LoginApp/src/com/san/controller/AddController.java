package com.san.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.san.bean.Productbean;
import com.san.service.ProductService;

public class AddController extends HttpServlet {

	
	private ProductService productService= new ProductService();
	

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	
		/*int id = Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("name");
		String desc = request.getParameter("desc");
		
		Productbean pb1 = new Productbean();
		
		pb1.setId(id);
		pb1.setName(name);
		pb1.setDesc(desc);*/
		
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/additem.jsp");
	dispatcher.forward(request, response);
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
