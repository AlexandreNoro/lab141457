package Testes;

import br.univel.venda.VendaWBS;
import br.univel.venda.VendaWBSService;

public class Venda {

	public static void main(String[] args) {
		VendaWBSService service = new VendaWBSService();
		VendaWBS port = service.getVendaWBSPort();
		String result = port.vender(5527);
		System.out.println(result);
	}
}
