// Creating Servlet using HttpServlet:
// HTTPServlet is a SubClass / ChildClass of GenericServlet....
// Internally Http Servlet Extends to Generic Class and GenericServlet Implements to Servlet Interface...



package myservlet;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;



public class ThirdServlet extends HttpServlet {
	
// Recieving GET Request and Processing it and Giving Dynamic Response.
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException {
		
		// Printing in a Server Console...
		
		System.out.println("This is a HttpServlet....");
		System.out.println("This is a Get Method..");
		
		// Printing / writing on browser. Giving Response to Browser..
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		pw.println("<h1>This is a HttpServlet....</h1>");
		
		// Recieving Get  Request from index Page..
		
		String s = req.getParameter("t3g");
		
		pw.println("<h1>Hellow , MR."+s+"  (GET Method)</h1>");
		
		}
	
	
	// Recieving POST Request and Processing it and Giving Dynamic Response.
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException {
		
		// printing in server console.
		
		System.out.println("This is a Post Method..");
		
		
		// Writing / Printing on Browser..
		
		PrintWriter pw2 = res.getWriter();
		res.setContentType("text/html");
		pw2.println("<h1>This is a POST Method....</h1>");
		
		
		// Catching Post Request from client..
		
		String s = req.getParameter("t3p");
		
		pw2.println("<h1>Hellow , MR."+s+" (POST Method)</h1>");

		
	}
	
}


