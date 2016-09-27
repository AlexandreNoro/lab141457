
package br.univel.venda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.venda package. 
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

    private final static QName _Vender_QNAME = new QName("http://webservices.univel.br/", "vender");
    private final static QName _VenderResponse_QNAME = new QName("http://webservices.univel.br/", "venderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.venda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VenderResponse }
     * 
     */
    public VenderResponse createVenderResponse() {
        return new VenderResponse();
    }

    /**
     * Create an instance of {@link Vender }
     * 
     */
    public Vender createVender() {
        return new Vender();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vender }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "vender")
    public JAXBElement<Vender> createVender(Vender value) {
        return new JAXBElement<Vender>(_Vender_QNAME, Vender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VenderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "venderResponse")
    public JAXBElement<VenderResponse> createVenderResponse(VenderResponse value) {
        return new JAXBElement<VenderResponse>(_VenderResponse_QNAME, VenderResponse.class, null, value);
    }

}
