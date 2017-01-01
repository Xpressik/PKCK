//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.30 at 05:13:21 PM CET 
//


package classes.from.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the classes.from.xsd package. 
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

    private final static QName _Przedmiot_QNAME = new QName("", "przedmiot");
    private final static QName _Imi�_QNAME = new QName("", "imi\u0119");
    private final static QName _Tytu�_QNAME = new QName("", "tytu\u0142");
    private final static QName _Wydzia�_QNAME = new QName("", "wydzia\u0142");
    private final static QName _Kierunek_QNAME = new QName("", "kierunek");
    private final static QName _Koniec_QNAME = new QName("http://czas.example.com", "koniec");
    private final static QName _Index_QNAME = new QName("", "index");
    private final static QName _Plany_QNAME = new QName("", "plany");
    private final static QName _Uczelnia_QNAME = new QName("", "uczelnia");
    private final static QName _Semestr_QNAME = new QName("", "semestr");
    private final static QName _NumerSali_QNAME = new QName("", "numer_sali");
    private final static QName _Specjalizacja_QNAME = new QName("", "specjalizacja");
    private final static QName _Nazwisko_QNAME = new QName("", "nazwisko");
    private final static QName _Numer_QNAME = new QName("", "numer");
    private final static QName _Start_QNAME = new QName("http://czas.example.com", "start");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: classes.from.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dzie� }
     * 
     */
    public Dzie� createDzie�() {
        return new Dzie�();
    }

    /**
     * Create an instance of {@link Zaj�cia }
     * 
     */
    public Zaj�cia createZaj�cia() {
        return new Zaj�cia();
    }

    /**
     * Create an instance of {@link Prowadz�cy }
     * 
     */
    public Prowadz�cy createProwadz�cy() {
        return new Prowadz�cy();
    }

    /**
     * Create an instance of {@link Czas }
     * 
     */
    public Czas createCzas() {
        return new Czas();
    }

    /**
     * Create an instance of {@link Budynek }
     * 
     */
    public Budynek createBudynek() {
        return new Budynek();
    }

    /**
     * Create an instance of {@link Zbi�rPlan�wZaj�� }
     * 
     */
    public Zbi�rPlan�wZaj�� createZbi�rPlan�wZaj��() {
        return new Zbi�rPlan�wZaj��();
    }

    /**
     * Create an instance of {@link Autor }
     * 
     */
    public Autor createAutor() {
        return new Autor();
    }

    /**
     * Create an instance of {@link Nag��wek }
     * 
     */
    public Nag��wek createNag��wek() {
        return new Nag��wek();
    }

    /**
     * Create an instance of {@link Autorzy }
     * 
     */
    public Autorzy createAutorzy() {
        return new Autorzy();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link Plan }
     * 
     */
    public Plan createPlan() {
        return new Plan();
    }

    /**
     * Create an instance of {@link ListaProwadz�cych }
     * 
     */
    public ListaProwadz�cych createListaProwadz�cych() {
        return new ListaProwadz�cych();
    }

    /**
     * Create an instance of {@link DefinicjaProwadz�cego }
     * 
     */
    public DefinicjaProwadz�cego createDefinicjaProwadz�cego() {
        return new DefinicjaProwadz�cego();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "przedmiot")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPrzedmiot(String value) {
        return new JAXBElement<String>(_Przedmiot_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "imi\u0119")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createImi�(String value) {
        return new JAXBElement<String>(_Imi�_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tytu\u0142")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTytu�(String value) {
        return new JAXBElement<String>(_Tytu�_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "wydzia\u0142")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWydzia�(String value) {
        return new JAXBElement<String>(_Wydzia�_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kierunek")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createKierunek(String value) {
        return new JAXBElement<String>(_Kierunek_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://czas.example.com", name = "koniec")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createKoniec(String value) {
        return new JAXBElement<String>(_Koniec_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "index")
    public JAXBElement<Long> createIndex(Long value) {
        return new JAXBElement<Long>(_Index_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zbi�rPlan�wZaj�� }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "plany")
    public JAXBElement<Zbi�rPlan�wZaj��> createPlany(Zbi�rPlan�wZaj�� value) {
        return new JAXBElement<Zbi�rPlan�wZaj��>(_Plany_QNAME, Zbi�rPlan�wZaj��.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uczelnia")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUczelnia(String value) {
        return new JAXBElement<String>(_Uczelnia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "semestr")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSemestr(String value) {
        return new JAXBElement<String>(_Semestr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numer_sali")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNumerSali(String value) {
        return new JAXBElement<String>(_NumerSali_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "specjalizacja")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecjalizacja(String value) {
        return new JAXBElement<String>(_Specjalizacja_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nazwisko")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNazwisko(String value) {
        return new JAXBElement<String>(_Nazwisko_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNumer(String value) {
        return new JAXBElement<String>(_Numer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://czas.example.com", name = "start")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStart(String value) {
        return new JAXBElement<String>(_Start_QNAME, String.class, null, value);
    }

}