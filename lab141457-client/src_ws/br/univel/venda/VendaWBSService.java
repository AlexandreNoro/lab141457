
package br.univel.venda;

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
@WebServiceClient(name = "VendaWBSService", targetNamespace = "http://webservices.univel.br/", wsdlLocation = "http://localhost:8085/lab141457/VendaWBS?wsdl")
public class VendaWBSService
    extends Service
{

    private final static URL VENDAWBSSERVICE_WSDL_LOCATION;
    private final static WebServiceException VENDAWBSSERVICE_EXCEPTION;
    private final static QName VENDAWBSSERVICE_QNAME = new QName("http://webservices.univel.br/", "VendaWBSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/lab141457/VendaWBS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VENDAWBSSERVICE_WSDL_LOCATION = url;
        VENDAWBSSERVICE_EXCEPTION = e;
    }

    public VendaWBSService() {
        super(__getWsdlLocation(), VENDAWBSSERVICE_QNAME);
    }

    public VendaWBSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VENDAWBSSERVICE_QNAME, features);
    }

    public VendaWBSService(URL wsdlLocation) {
        super(wsdlLocation, VENDAWBSSERVICE_QNAME);
    }

    public VendaWBSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VENDAWBSSERVICE_QNAME, features);
    }

    public VendaWBSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VendaWBSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VendaWBS
     */
    @WebEndpoint(name = "VendaWBSPort")
    public VendaWBS getVendaWBSPort() {
        return super.getPort(new QName("http://webservices.univel.br/", "VendaWBSPort"), VendaWBS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VendaWBS
     */
    @WebEndpoint(name = "VendaWBSPort")
    public VendaWBS getVendaWBSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.univel.br/", "VendaWBSPort"), VendaWBS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VENDAWBSSERVICE_EXCEPTION!= null) {
            throw VENDAWBSSERVICE_EXCEPTION;
        }
        return VENDAWBSSERVICE_WSDL_LOCATION;
    }

}