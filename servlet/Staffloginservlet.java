package servlet;

import imple.Imple;
import inter.Inter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Userregbean;

/**
 * Servlet implementation class Staffloginservlet
 */
@WebServlet("/Staffloginservlet")
public class Staffloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Staffloginservlet() {
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
		
		String name=request.getParameter("username");
		System.out.println("username: "+name);
		
		String pass=request.getParameter("password");
		System.out.println("password: "+pass);
		
		String ipadd=request.getParameter("ipadd");
		System.out.println("ipaddress: "+ipadd);
		
		HttpSession sess=request.getSession();
		sess.setAttribute( "emailkey",name);
		sess.setAttribute( "ipaddkey",sess);
		
		System.out.println("email: "+name);
		System.out.println("ipaddress: "+ipadd);
		
		Userregbean ur=new Userregbean();
		ur.setEmail(name);
		ur.setPassword(pass);
		
		Inter in=new Imple();
		boolean log=in.ulog(ur);
		
		if(log==true){
			response.sendRedirect("staffmainpage.jsp");
		}
		else{
			response.sendRedirect("userloginerror.jsp");
		}

		
	}

}
