package br.univel.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@JMSDestinationDefinitions(value = {
		@JMSDestinationDefinition(name = "java:/queue/SERVLETENTREGAQueue", interfaceName = "javax.jms.Queue", destinationName = "ServletEntregaQueue"),
		@JMSDestinationDefinition(name = "java:/topic/SERVLETENTREGATopic", interfaceName = "javax.jms.Topic", destinationName = "ServletEntregaTopic") })

@WebServlet("/Entrega")
public class ServletEntrega extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 907027830926618330L;

	private static final int MSG_COUNT = 5;

	@Inject
	private JMSContext context;

	@Resource(lookup = "java:/queue/SERVLETENTREGAQueue")
	private Queue queue;

	@Resource(lookup = "java:/topic/SERVLETENTREGATopic")
	private Topic topic;

	public ServletEntrega() {
		// TODO Auto-generated constructor stub
	}

	protected void getEntrega(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.write(
				"<h1>Trabalho de Java 3ºBIMESTRE - Fase 1 <strong>JMS 2.0</strong> e <strong>EJB 3.2 Message-Driven Bean</strong> in WildFly 9.</h1>");
		try {
			boolean useTopic = req.getParameterMap().keySet().contains("topic");
			final Destination destination = useTopic ? topic : queue;

			out.write("<p>Envio de mensagens para <em>" + destination + "</em></p>");
			out.write("<h2>Seguintes mensagens será enviada para o destino :</h2>");
			for (int i = 0; i < MSG_COUNT; i++) {
				String text = "Esta é a mensagem " + (i + 1);
				context.createProducer().send(destination, text);
				out.write("Mensagem (" + i + "): " + text + "</br>");
			}
			out.write(
					"<p><i>Ir para o seu console do servidor JBoss Application Server ou o log do servidor para ver o resultado do processamento de mensagens</i></p>");
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
