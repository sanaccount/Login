package com.san.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.san.bean.Productbean;
import com.san.service.ProductService;

public class ProductController extends HttpServlet {

	
	private ProductService productService= new ProductService();

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	List<Productbean> pb = productService.getData();
	request.setAttribute("data", pb);

	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/product.jsp");
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
