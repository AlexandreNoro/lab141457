package MDBS;

import java.sql.Timestamp;
import java.util.Calendar;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.hibernate.Session;

import br.univel.Log;
import br.univel.Venda;
import br.univel.Hibernate.ConfigHibernate;

@MessageDriven(name = "MdbAuditoria", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TOPICVenda"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

@TransactionManagement(TransactionManagementType.BEAN)
public class MdbAuditoria implements MessageListener {

	@Override
	public void onMessage(Message arg0) {
		if (arg0 instanceof ObjectMessage) {
			ObjectMessage om = (ObjectMessage) arg0;
			try {
				Venda venda = (Venda) om.getObject();

				Log logg = new Log();
				logg.setData_time(new Timestamp(Calendar.getInstance().getTimeInMillis()));
				;
				logg.setNome_mdb("MdbAuditoria");
				logg.setMsg(venda.toString());

				Session session = ConfigHibernate.getSessionFactory().openSession();
				session.beginTransaction();
				session.persist(logg);
				session.getTransaction().commit();
				session.close();

			} catch (JMSException e) {

				e.printStackTrace();
			}
		}

	}

}
