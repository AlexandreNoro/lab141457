
package br.univel.produto;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProdutoWBSService", targetNamespace = "http://webservices.univel.br/", wsdlLocation = "http://localhost:8085/lab141457/ProdutoWBS?wsdl")
public class ProdutoWBSService
    extends Service
{

    private final static URL PRODUTOWBSSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUTOWBSSERVICE_EXCEPTION;
    private final static QName PRODUTOWBSSERVICE_QNAME = new QName("http://webservices.univel.br/", "ProdutoWBSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/lab141457/ProdutoWBS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUTOWBSSERVICE_WSDL_LOCATION = url;
        PRODUTOWBSSERVICE_EXCEPTION = e;
    }

    public ProdutoWBSService() {
        super(__getWsdlLocation(), PRODUTOWBSSERVICE_QNAME);
    }

    public ProdutoWBSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUTOWBSSERVICE_QNAME, features);
    }

    public ProdutoWBSService(URL wsdlLocation) {
        super(wsdlLocation, PRODUTOWBSSERVICE_QNAME);
    }

    public ProdutoWBSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUTOWBSSERVICE_QNAME, features);
    }

    public ProdutoWBSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProdutoWBSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProdutoWBS
     */
    @WebEndpoint(name = "ProdutoWBSPort")
    public ProdutoWBS getProdutoWBSPort() {
        return super.getPort(new QName("http://webservices.univel.br/", "ProdutoWBSPort"), ProdutoWBS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProdutoWBS
     */
    @WebEndpoint(name = "ProdutoWBSPort")
    public ProdutoWBS getProdutoWBSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.univel.br/", "ProdutoWBSPort"), ProdutoWBS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUTOWBSSERVICE_EXCEPTION!= null) {
            throw PRODUTOWBSSERVICE_EXCEPTION;
        }
        return PRODUTOWBSSERVICE_WSDL_LOCATION;
    }

}
