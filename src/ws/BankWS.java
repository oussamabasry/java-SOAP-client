
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "bankWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankWS {


    /**
     * 
     * @param amount
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionDHToEuro", targetNamespace = "http://ws/", className = "ws.ConversionDHToEuro")
    @ResponseWrapper(localName = "conversionDHToEuroResponse", targetNamespace = "http://ws/", className = "ws.ConversionDHToEuroResponse")
    @Action(input = "http://ws/bankWS/conversionDHToEuroRequest", output = "http://ws/bankWS/conversionDHToEuroResponse")
    public double conversionDHToEuro(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @param accountId
     * @return
     *     returns ws.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://ws/", className = "ws.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://ws/", className = "ws.GetAccountResponse")
    @Action(input = "http://ws/bankWS/getAccountRequest", output = "http://ws/bankWS/getAccountResponse")
    public Account getAccount(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Account>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccounts", targetNamespace = "http://ws/", className = "ws.GetAccounts")
    @ResponseWrapper(localName = "getAccountsResponse", targetNamespace = "http://ws/", className = "ws.GetAccountsResponse")
    @Action(input = "http://ws/bankWS/getAccountsRequest", output = "http://ws/bankWS/getAccountsResponse")
    public List<Account> getAccounts();

}
