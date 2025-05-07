package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hackerloginservlet
 */
@WebServlet("/Hackerloginservlet")
public class Hackerloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hackerloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=request.getParameter("username");
		System.out.println("Username "+uname);
		String pass=request.getParameter("password");
		System.out.println("password "+pass);
		
		HttpSession sess=request.getSession();
		sess.setAttribute( "emailkey",uname);
		//sess.setAttribute( "ipaddkey",sess);
		
			
		
		if(uname.equals("hacker") && pass.equals("hacker")) {
				
			//response.sendRedirect("adminmainpagejsp.jsp");
			RequestDispatcher rd=request.getRequestDispatcher("hackermainpage.jsp");  
	        rd.forward(request, response);  
			
		}
					
	else{
		response.sendRedirect("hackermainpage.jsp");
	}
		
	}

}
