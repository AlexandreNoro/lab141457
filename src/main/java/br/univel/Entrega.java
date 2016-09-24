package br.univel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Entrega implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 3822326798234322557L;

	private int id_entrega;
	private String endereco;
	private boolean entrega;
	private Date data_entrega;
	private List<String> itens;
	private BigDecimal vlrTotal;

	public Entrega() {

	}

	public int getId_entrega() {
		return id_entrega;
	}

	public void setId_entrega(int id_entrega) {
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

	public Date getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(Date data_entrega) {
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

	@Override
	public String toString() {
		return "Id de Entrega: " + getId_entrega() + " Endereço: " + getEndereco() + "Entrega: " + isEntrega()
				+ "Data de Entrega: " + getData_entrega() + "Itens: " + getItens() + "Valor Total: " + getVlrTotal();
	}

}
