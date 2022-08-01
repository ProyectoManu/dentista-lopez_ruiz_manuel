package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class dentistaservlet
 */
@WebServlet("/registrarcita")
public class dentistaservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dentistaservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	PrintWriter out = response.getWriter();
	
	String dia_cita= request.getParameter("dia_cita");
	String hora_cita= request.getParameter("hora_cita");
	String nombre= request.getParameter("nombre");
	String apellidos= request.getParameter("apellidos");
	int centro = Integer.parseInt(request.getParameter("centro"));
	String tipo= request.getParameter("tipo");
	out.println("<!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "<meta charset=\"ISO-8859-1\">\r\n"
			+ "<title>Insert title here</title>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "<body>");
	out.println("<h1> Resumen de citas </h1>");
	out.println("<ul>");
	out.println("<li> Dia_Cita : "+dia_cita+"</li>");
	out.println("<li> Hora_Cita: "+hora_cita+"</li>");
	out.println("<li> Nombre: "+nombre+"</li>");
	out.println("<li> Apellidos: "+apellidos+"</li>");
	out.println("<li> Centro: "+centro+"</li>");
	out.println("<li> Tipo: "+tipo+"</li>");
	
	
		}
			out.println("</ul>");
			out.println("</li>");
			
		}
	
	out.println("</body>\r\n"+ "</html>");
	
	
}
}
