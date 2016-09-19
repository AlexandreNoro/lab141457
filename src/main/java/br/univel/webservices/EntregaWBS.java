package br.univel.webservices;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import EJBS.ProcessEntregaWBS;
import br.univel.Entrega;

@WebService
public class EntregaWBS {

	@EJB(name = "processEntregaWBS")

	private ProcessEntregaWBS processEntregaWBS;

	@WebMethod(operationName = "entrega")

	@WebResult(name = "resultEntrega")

	public String entrega(

			@WebParam(name = "id_entrega") Float id_entrega, @WebParam(name = "endereco") String endereco,
			@WebParam(name = "data_venda") String data_venda, @WebParam(name = "data_entrega") String data_entrega,
			@WebParam(name = "itens") List<String> itens, @WebParam(name = "vlrTotal") BigDecimal vlrTotal) {
		try {
			Entrega entrega = new Entrega();
			entrega.setId_entrega(id_entrega);
			entrega.setEndereco(endereco);
			entrega.setData_venda(data_venda);
			entrega.setData_entrega(data_entrega);
			entrega.setItens(itens);
			entrega.setVlrTotal(vlrTotal);

			processEntregaWBS.processarEntrega(entrega);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return "Concluído a operação";
	}

}
