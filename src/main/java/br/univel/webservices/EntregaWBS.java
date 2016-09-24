package br.univel.webservices;

import java.sql.Date;
import java.util.Calendar;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import EJBS.ProcessEntrega;
import br.univel.Entrega;

@WebService
public class EntregaWBS {

	@EJB
	ProcessEntrega ProcessEntregaEJB;

	@WebMethod(operationName = "entregar")
	@WebResult(name = "statusEntrega")
	public String doGet(@WebParam(name = "enderecoEntrega") String endereco) {

		Entrega entrega = new Entrega();
		entrega.setId_entrega(2);
		entrega.setData_entrega(new Date(Calendar.DATE));
		entrega.setEndereco(endereco);

		ProcessEntregaEJB.processarEntrega(entrega);
		return "Entrega enviada";
	}

}
