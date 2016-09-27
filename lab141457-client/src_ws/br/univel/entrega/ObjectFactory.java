
package br.univel.entrega;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.entrega package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EntregarResponse_QNAME = new QName("http://webservices.univel.br/", "entregarResponse");
    private final static QName _Entregar_QNAME = new QName("http://webservices.univel.br/", "entregar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.entrega
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Entregar }
     * 
     */
    public Entregar createEntregar() {
        return new Entregar();
    }

    /**
     * Create an instance of {@link EntregarResponse }
     * 
     */
    public EntregarResponse createEntregarResponse() {
        return new EntregarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "entregarResponse")
    public JAXBElement<EntregarResponse> createEntregarResponse(EntregarResponse value) {
        return new JAXBElement<EntregarResponse>(_EntregarResponse_QNAME, EntregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entregar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "entregar")
    public JAXBElement<Entregar> createEntregar(Entregar value) {
        return new JAXBElement<Entregar>(_Entregar_QNAME, Entregar.class, null, value);
    }

}
