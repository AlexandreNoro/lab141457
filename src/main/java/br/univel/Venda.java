package br.univel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Venda implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8052670432604566361L;

	private Float id_venda;
	private String cpf_cliente;
	private List<String> itens;
	private BigDecimal vlrTotal;


	public Float getId_venda() {
		return id_venda;
	}
	public void setId_venda(Float id_venda) {
		this.id_venda = id_venda;
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




}
