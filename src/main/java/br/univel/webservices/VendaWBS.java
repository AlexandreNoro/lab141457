package br.univel.webservices;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import EJBS.ProcessVendaWBS;
import br.univel.Venda;

@WebService
public class VendaWBS {

	@EJB(name = "processVendaWBS")
	private ProcessVendaWBS processVendaWBS;

	@WebMethod(operationName = "venda")
	@WebResult(name = "resultVenda")

	public String venda(

			@WebParam(name = "id_venda") Float id_venda, @WebParam(name = "cpf_cliente") String cpf_cliente,
			@WebParam(name = "itens") List<String> itens, @WebParam(name = "vlrTotal") BigDecimal vlrTotal) {

		try {

			Venda venda = new Venda();
			venda.setId_venda(id_venda);
			venda.setCpf_cliente(cpf_cliente);
			venda.setItens(itens);
			venda.setVlrTotal(vlrTotal);

			processVendaWBS.processarVenda(venda);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return "Concluído a operação";
	}

}
