package com.sathya.servletsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//read the data from client
		String qualification=request.getParameter("qualification");
		String designation=request.getParameter("designation");
		
		//create the session object
		
		HttpSession session=request.getSession(false);
		
		//place the data into session
      session.setAttribute("qualification",qualification);
      session.setAttribute("designation",designation );
      
      //Forward the data to 2nd form

      RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
      dispatcher.forward(request, response);

	}

}
