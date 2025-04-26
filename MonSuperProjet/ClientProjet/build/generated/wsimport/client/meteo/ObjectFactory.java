
package meteo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the meteo package. 
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

    private final static QName _GetmeteoResponse_QNAME = new QName("http://meteo/", "getmeteoResponse");
    private final static QName _Getmeteo_QNAME = new QName("http://meteo/", "getmeteo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: meteo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetmeteoResponse }
     * 
     */
    public GetmeteoResponse createGetmeteoResponse() {
        return new GetmeteoResponse();
    }

    /**
     * Create an instance of {@link Getmeteo }
     * 
     */
    public Getmeteo createGetmeteo() {
        return new Getmeteo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetmeteoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://meteo/", name = "getmeteoResponse")
    public JAXBElement<GetmeteoResponse> createGetmeteoResponse(GetmeteoResponse value) {
        return new JAXBElement<GetmeteoResponse>(_GetmeteoResponse_QNAME, GetmeteoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getmeteo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://meteo/", name = "getmeteo")
    public JAXBElement<Getmeteo> createGetmeteo(Getmeteo value) {
        return new JAXBElement<Getmeteo>(_Getmeteo_QNAME, Getmeteo.class, null, value);
    }

}
