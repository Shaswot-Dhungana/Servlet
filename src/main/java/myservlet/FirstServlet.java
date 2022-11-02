// Creating Servlet using Implementing  Servlet:
// Servlet is a Interface...


package myservlet;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;



public class FirstServlet implements Servlet{
	
	// Overriding LIfe Cycle Methods AND Non-LifeCycle Methods.......
	
	
	// LIfe Cycle Methods :~
	// Life Cycle Methods Got Executed Automatically , Need Not to call. 
	
	
	ServletConfig conf;  // Now we can use this variable inside Whole Class. 
	
	public void init(ServletConfig conf) {
		
		this.conf = conf;
		
		// You Can Write initialization code here.
		// printing in Server Console..
		System.out.println("Hellow , this is servlet using Implementing Servlet.....");
	}
	
	
	public void service(ServletRequest req , ServletResponse res) throws ServletException , IOException {
		
		// REquest/Logic processing is done here...
		
		// printing in Server Console..
				System.out.println("Request/Logic Processing / Servicing.....");
		
				PrintWriter pw = res.getWriter();
				pw.println("<h1>This is servlet using Implementing Servlet.....</h1>");
				
				
				String s = req.getParameter("t1");
				pw.println("<h1>Welcome MR."+s+"</h1>");
				
				System.out.println("Welcome MR."+s);
				
				pw.close();				
		
	}
	
	
	public void destroy() {
		// printing in Server Console..
				System.out.println("Destroying Servlet Object.......");
	}
	
	
	
	// Non-LifeCycle Methods :~
	// Non Life Cycle Methods Got Executed When Called By Developer , oTherwise it will not execute..
	
	public ServletConfig getServletConfig() {
		return conf;
	}
	
	
	
	public String getServletInfo() {
		return "Shaswot Dhungana Has Created This Servlet......";
	}
	
	
	
	
	
	
	
	
}