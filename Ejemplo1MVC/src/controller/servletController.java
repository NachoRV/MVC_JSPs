package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Rectangulo;

/**
 * Servlet implementation class servletController
 */
@WebServlet("/servletController")
public class servletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Procesar los parametros si procede
		
		String accion = request.getParameter("accion");
		
		// 2. Creammos los java Beans con los datos del formulario o BBDD
		
		Rectangulo recRequest = new Rectangulo(3,1);
		Rectangulo recSesion = new Rectangulo(3,2);
		Rectangulo recAplicacion = new Rectangulo(3,3);
		
		if ("agregarVariables".equals(accion)) {
			// 3. Agregamos las variables en el alcance correspondiente
			request.setAttribute("rectanguloRequest", recRequest);
			// sesion
			//alcance Sesion dura unos 30 minutos si no se modifica
			HttpSession sesion = request.getSession();
			sesion.setAttribute("rectanguloSesion", recSesion);
			// aplicacion 
			
			ServletContext aplicacion = this.getServletContext();
			aplicacion.setAttribute("rectanguloAplicacion", recAplicacion);
			
			request.setAttribute("mensaje", "las variables fueron agregadas");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		} else if ("listarVariables".equals(accion)) {
			request.getRequestDispatcher("/WEB-INF/alcanceVariables.jsp").forward(request, response);
		} else {
			request.setAttribute("mensaje", "Accion desconocida");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
		
		
		// 4. redireccionamos a la vista
		
		/*RequestDispatcher rd = request.getRequestDispatcher("vistas/desplegarVariables.jsp");
		rd.forward(request, response);
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
