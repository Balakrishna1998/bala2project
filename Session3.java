package com.sathya.servletsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session3")
public class Session3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		        //read the data from client
				String email=request.getParameter("email");
				String mobile=request.getParameter("mobile");
				
				//create the session object
				
				HttpSession session=request.getSession(false);
				
				//place the data into session
		        session.setAttribute("email", email);
		        session.setAttribute("mobile",mobile);
		      
		         //Forward the data to display from

		        RequestDispatcher dispatcher=request.getRequestDispatcher("display.html");
		        dispatcher.forward(request, response);
	}

}
