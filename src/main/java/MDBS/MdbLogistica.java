package MDBS;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(name = "MdbLogistica", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "Queue/QUEUEPedido"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbLogistica implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

	@Override
	public void onMessage(Message arg0) {
		ObjectMessage omsg = null;
		try {

			LOGGER.warning("Despachando pedido......");
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		LOGGER.warning("Entrega Despachada!");

	}

}
