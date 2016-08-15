package MDBS;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@MessageDriven(name = "MdbContabilidade", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TOPICVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbContabilidade implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbContabilidade.class.toString());

	@Override
	public void onMessage(Message arg0) {

		ObjectMessage omsg = null;
		try {
			omsg = (ObjectMessage) arg0;
			LOGGER.warning(omsg.getObject().toString());
			LOGGER.warning("MdbContabilidade");
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}