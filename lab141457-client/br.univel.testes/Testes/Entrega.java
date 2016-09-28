package Testes;

import br.univel.entrega.EntregaWBS;
import br.univel.entrega.EntregaWBSService;

public class Entrega {

	public static void main(String[] args) {
		EntregaWBSService service = new EntregaWBSService();
		EntregaWBS port = service.getEntregaWBSPort();
		String result = port.entregar("Avenida Curitiba, 681");
		System.out.println(result);
	}
}
