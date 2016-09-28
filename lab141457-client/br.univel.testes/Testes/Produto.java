package Testes;

import java.math.BigDecimal;

import br.univel.produto.ProdutoWBS;
import br.univel.produto.ProdutoWBSService;

public class Produto {

	public Produto() {
		excluir();
	}

	public static void main(String[] args) {
		new Produto();
	}

	public void criar(){
		ProdutoWBSService servico = new ProdutoWBSService();
		ProdutoWBS port = servico.getProdutoWBSPort();
		String retorno = port.cadastrarProduto("N0R0141457", "Alexandre", new BigDecimal("20"));
		System.out.println(retorno);
	}

	public void ler(){
		ProdutoWBSService servico = new ProdutoWBSService();
		ProdutoWBS port = servico.getProdutoWBSPort();
		String retorno = port.lerProduto((long) 2);
		System.out.println(retorno);
	}

	public void atualizar(){
		ProdutoWBSService servico = new ProdutoWBSService();
		ProdutoWBS port = servico.getProdutoWBSPort();
		String retorno = port.atualizarProduto((long) 2, "N0R0141457", "Alexandre Noro", new BigDecimal("22"));
		System.out.println(retorno);
	}

	public void excluir(){
		ProdutoWBSService servico = new ProdutoWBSService();
		ProdutoWBS port = servico.getProdutoWBSPort();
		String retorno = port.excluirProduto((long) 2);
		System.out.println(retorno);
	}
}
