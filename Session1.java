package com.sathya.servletsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session1")
public class Session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Session1() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//read the data from client
		String username=request.getParameter("username");
		String age=request.getParameter("age");
		
		//create the session object
		
		HttpSession session=request.getSession();
		
		//place the data into session
      session.setAttribute("username",username);
      session.setAttribute("age",age );
      
      //Forward the data to 2nd from
      
      RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
      dispatcher.forward(request, response);

	}

}
