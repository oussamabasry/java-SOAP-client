
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _GetAccountsResponse_QNAME = new QName("http://ws/", "getAccountsResponse");
    private final static QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private final static QName _ConversionDHToEuro_QNAME = new QName("http://ws/", "conversionDHToEuro");
    private final static QName _GetAccounts_QNAME = new QName("http://ws/", "getAccounts");
    private final static QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");
    private final static QName _Account_QNAME = new QName("http://ws/", "account");
    private final static QName _ConversionDHToEuroResponse_QNAME = new QName("http://ws/", "conversionDHToEuroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link ConversionDHToEuro }
     * 
     */
    public ConversionDHToEuro createConversionDHToEuro() {
        return new ConversionDHToEuro();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ConversionDHToEuroResponse }
     * 
     */
    public ConversionDHToEuroResponse createConversionDHToEuroResponse() {
        return new ConversionDHToEuroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<GetAccountsResponse>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionDHToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionDHToEuro")
    public JAXBElement<ConversionDHToEuro> createConversionDHToEuro(ConversionDHToEuro value) {
        return new JAXBElement<ConversionDHToEuro>(_ConversionDHToEuro_QNAME, ConversionDHToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<GetAccounts>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionDHToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionDHToEuroResponse")
    public JAXBElement<ConversionDHToEuroResponse> createConversionDHToEuroResponse(ConversionDHToEuroResponse value) {
        return new JAXBElement<ConversionDHToEuroResponse>(_ConversionDHToEuroResponse_QNAME, ConversionDHToEuroResponse.class, null, value);
    }

}
