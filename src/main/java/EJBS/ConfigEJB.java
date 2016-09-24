package EJBS;

import javax.ejb.Stateless;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;


@JMSDestinationDefinitions(value = {
		@JMSDestinationDefinition(name = "java:/queue/QUEUEPedido", interfaceName = "javax.jms.Queue", destinationName = "QUEUEPedido"),
		@JMSDestinationDefinition(name = "java:/topic/TOPICVenda", interfaceName = "javax.jms.Topic", destinationName = "TOPICVenda") })
@Stateless
public class ConfigEJB {

}
