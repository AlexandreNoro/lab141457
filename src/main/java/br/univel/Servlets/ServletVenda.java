package br.univel.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EJBS.ProcessVenda;
import br.univel.Venda;

@WebServlet("/Venda")
public class ServletVenda extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	ProcessVenda ProcessVendaEJB;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Venda venda = new Venda();
		venda.setId_venda(1);

		ArrayList<String> itens = new ArrayList<>();
		itens.add("1");
		itens.add("2");

		venda.setData_venda(new Date(Calendar.DATE));
		venda.setCpf_cliente("085.444.752.78");

		ProcessVendaEJB.processarVenda(venda);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write("Processo de venda");
	}

}
