package br.univel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Entrega implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 3822326798234322557L;

	private Float id_entrega;
	private String endereco;
	private boolean entrega;
	private String data_venda;
	private String data_entrega;
	private List<String> itens;
	private BigDecimal vlrTotal;

	public Entrega() {

	}

	public Float getId_entrega() {
		return id_entrega;
	}

	public void setId_entrega(Float id_entrega) {
		this.id_entrega = id_entrega;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

	public String getData_venda() {
		return data_venda;
	}

	public void setData_venda(String data_venda) {
		this.data_venda = data_venda;
	}

	public String getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(String data_entrega) {
		this.data_entrega = data_entrega;
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
