package br.univel.webservices;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import EJBS.ProcessVenda;
import br.univel.Venda;

@WebService
public class VendaWBS {

	@EJB
	ProcessVenda ProcessVendaEJB;

	@WebMethod(operationName = "vender")
	@WebResult(name = "status_Venda")
	public String doGet(@WebParam(name = "num_Nota") int num) {
		Venda venda = new Venda();
		venda.setId_venda(2);

		ArrayList<String> itens = new ArrayList<>();
		itens.add("1");
		itens.add("2");

		venda.setCpf_cliente("085.444.752.78");
		venda.setData_venda(new Date(Calendar.DATE));
		venda.setItens((java.util.List<String>) itens);

		ProcessVendaEJB.processarVenda(venda);

		return "Venda Concluída";
	}
}
