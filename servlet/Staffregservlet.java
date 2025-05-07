package servlet;

import imple.Imple;
import inter.Inter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Userregbean;

/**
 * Servlet implementation class Staffregservlet
 */
@WebServlet("/Staffregservlet")
public class Staffregservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Staffregservlet() {
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
		
		String phno=request.getParameter("phonenumber");
		System.out.println("Phoneno "+phno);
		
		String email=request.getParameter("email");
		System.out.println("Email "+email);
		
		String pass=request.getParameter("password");
		System.out.println("Password "+pass);
		
		String ipadd=request.getParameter("ipadd");
		System.out.println("Ipaddress "+ipadd);
		
		Userregbean ur=new Userregbean();
		ur.setName(uname);
		ur.setPhoeneno(phno);
		ur.setEmail(email);
		ur.setPassword(pass);
		ur.setIpadd(ipadd);
		
		Inter in=new Imple();
		int i=in.ureg(ur);
		if(i==1){
			response.sendRedirect("stafflogin.jsp");
		}
		else{
			response.sendRedirect("erro.jsp");
		}

		
	}

}
