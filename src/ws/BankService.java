
package ws;

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
@WebServiceClient(name = "BankServiceService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8585/bankWS?wsdl")
public class BankService
    extends Service
{

    private final static URL BANKSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKSERVICESERVICE_EXCEPTION;
    private final static QName BANKSERVICESERVICE_QNAME = new QName("http://ws/", "BankServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8585/bankWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKSERVICESERVICE_WSDL_LOCATION = url;
        BANKSERVICESERVICE_EXCEPTION = e;
    }

    public BankService() {
        super(__getWsdlLocation(), BANKSERVICESERVICE_QNAME);
    }

    public BankService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKSERVICESERVICE_QNAME, features);
    }

    public BankService(URL wsdlLocation) {
        super(wsdlLocation, BANKSERVICESERVICE_QNAME);
    }

    public BankService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKSERVICESERVICE_QNAME, features);
    }

    public BankService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankWS
     */
    @WebEndpoint(name = "bankWSPort")
    public BankWS getBankWSPort() {
        return super.getPort(new QName("http://ws/", "bankWSPort"), BankWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankWS
     */
    @WebEndpoint(name = "bankWSPort")
    public BankWS getBankWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "bankWSPort"), BankWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKSERVICESERVICE_EXCEPTION!= null) {
            throw BANKSERVICESERVICE_EXCEPTION;
        }
        return BANKSERVICESERVICE_WSDL_LOCATION;
    }

}
