// Creating Servlet using GenericServlet:
// GenericServlet is a SubClass / ChildClass of Servlet Interface....
// Internally Generic Servlet Implements to Servlet Interface.


package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	public void service(ServletRequest req , ServletResponse res) throws ServletException , IOException {
		
		// printing in Console...
				System.out.println("Hellow , this is servlet using GenericServlet.....");
				
		// Printing in Browser...
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1>this is servlet using GenericServlet....</h1>");
		
		String s = req.getParameter("t2");
		pw.println("<h1>Welcome MR."+s+"</h1>");
		
		System.out.println("Welcome MR."+s);
		
		pw.close();	
	
		
	}
	
}
