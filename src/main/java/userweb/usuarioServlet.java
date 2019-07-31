package userweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.izl.model.Usuario;
import br.com.izl.service.usuarioService;

@WebServlet(urlPatterns = { "/usuario", "/usuarioServlet", "/usuarioManagement" })
public class usuarioServlet extends HttpServlet {

	usuarioService usuarioService;

	public usuarioServlet() {
		System.out.println("construindo Servlet...");
	}

	@Override
	public void init() throws ServletException {
		usuarioService = new usuarioService(); // inicia a lista
		System.out.println("Construindo Servlet...");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inicializando Servlet");
		super.service(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String i = req.getParameter("i");
		String buscar = req.getParameter("buscar");

		if (i != null && i != "") {
			usuarioService.excluir(Integer.parseInt(i));
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("adduser.jsp");
		
		if(buscar==null) {
			
			req.setAttribute("usuarios", usuarioService.getTodosUsuarios());
	     	dispatcher.forward(req, resp);
			
	     	
		} else if (buscar.equals("1")) {
			
			req.setAttribute("usuarios", usuarioService.getAtivos());
			dispatcher.forward(req, resp);
			
		} else if (buscar.equals("2")) {
			
			req.setAttribute("usuarios", usuarioService.getInativos());
			dispatcher.forward(req, resp);
			
		} 
		
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// recebendo o login
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		String status = req.getParameter("status");
		String nome = req.getParameter("nome");

		// colocando o login e senha em um objeto usuario
		Usuario user = new Usuario();
		user.setLogin(login);
		user.setSenha(senha);
		user.setStatus(status);
		user.setNome(nome);

		usuarioService.cadastrar(user);

		RequestDispatcher dispatcher = req.getRequestDispatcher("adduser.jsp");
		req.setAttribute("usuarios", usuarioService.getTodosUsuarios());
		dispatcher.forward(req, resp);

	}

}
