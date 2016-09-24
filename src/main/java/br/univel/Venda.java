package br.univel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Venda implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8052670432604566361L;

	private int id_venda;
	private String cpf_cliente;
	private List<String> itens;
	private Date data_venda;
	private BigDecimal vlrTotal;

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public Date getData_venda() {
		return data_venda;
	}

	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

	public BigDecimal getVlrTotal() {
		return vlrTotal;
	}

	public void setVlrTotal(BigDecimal vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	@Override
	public String toString() {
		return "Id de Venda: " + getId_venda() + " CPF do Cliente: " + getCpf_cliente() + "Itens: " + getItens()
				+ "Valor Total: " + getVlrTotal();
	}

}
