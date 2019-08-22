package userweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.izl.service.usuarioService;

@WebServlet(urlPatterns = { "/login", "/loginServlet", "/loginManagement" })
public class loginServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("izaias") && password.equals("1234")) {
			
			HttpSession session = req.getSession();
			session.setAttribute("userSession", username);
			
			resp.sendRedirect("usuario");
			
			
			
		}else if(username.equals("larissa") && password.equals("1234")) {
			
			HttpSession session = req.getSession();
			session.setAttribute("userSession", username);
			
			resp.sendRedirect("usuario");
			
			
			
		} else {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
		
		}
	}
	

	
}



