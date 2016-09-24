package br.univel.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EJBS.ProcessEntrega;
import br.univel.Entrega;

@WebServlet("/Entrega")
public class ServletEntrega extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	ProcessEntrega ProcessEntregaEJB;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Entrega entrega = new Entrega();
		entrega.setId_entrega(1);
		entrega.setData_entrega(new Date(Calendar.DATE));
		entrega.setEndereco("Avenida Curitiba, 681");

		ProcessEntregaEJB.processarEntrega(entrega);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Processo de entrega");
	}

}
