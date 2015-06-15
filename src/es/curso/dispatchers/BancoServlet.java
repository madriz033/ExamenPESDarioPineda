package es.curso.dispatchers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.controllers.ejb.DarAltaTarjetaControllerEjb;
import es.curso.model.Entity.Tarjeta;

/**
 * Servlet implementation class TiendaServlet
 */
@WebServlet("/Banco/*")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BancoServlet() {
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		String titulo ="Sin título";
		
		RequestDispatcher rd;
				
		
		switch(action){
		
			case "altaTarjeta": // se debe redirigir hacia el formulario altaTarjeta
				rd= request.getRequestDispatcher("/jsp/altaTarjeta.jsp");
				rd.forward(request, response);
				break;
		
			
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher rd;
		
		switch(action){
			case "altaTarjeta": // recuperar los datos tecleados en formulario
				int id = Integer.parseInt( request.getParameter("id"));
				int numero = Integer.parseInt(request.getParameter("numero"));
				int cupoMaximo = Integer.parseInt(request.getParameter("cupoMaximo"));
				int saldoDisponible = Integer.parseInt( request.getParameter("saldoDisponible"));
				String tipo = request.getParameter("tipo");
				int numComprobacion = Integer.parseInt(request.getParameter("numComprobacion"));
				int contrasenha =Integer.parseInt(request.getParameter("contrasenha"));
				boolean bloqueada = request.getParameter("bloqueada").equals("si");
				
				Tarjeta tarjeta = new Tarjeta(id, numero, cupoMaximo, saldoDisponible,
						tipo, numComprobacion, contrasenha, bloqueada);
						
				
				// se invocara al controlador adecuado
				DarAltaTarjetaControllerEjb controlador= new DarAltaTarjetaControllerEjb();
				controlador.agregar(tarjeta);
				rd = request.getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
				break;
				
			
				
		}
	}

}
