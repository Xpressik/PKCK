//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.30 at 05:13:21 PM CET 
//


package classes.from.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}zaj�cia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nazwa_dnia" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zaj\u0119cia"
})
@XmlRootElement(name = "dzie\u0144")
public class Dzie� {

    protected List<Zaj�cia> zaj�cia;
    @XmlAttribute(name = "nazwa_dnia", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nazwaDnia;

    /**
     * Gets the value of the zaj�cia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zaj�cia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZaj�cia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zaj�cia }
     * 
     * 
     */
    public List<Zaj�cia> getZaj�cia() {
        if (zaj�cia == null) {
            zaj�cia = new ArrayList<Zaj�cia>();
        }
        return this.zaj�cia;
    }

    /**
     * Gets the value of the nazwaDnia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaDnia() {
        return nazwaDnia;
    }

    /**
     * Sets the value of the nazwaDnia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaDnia(String value) {
        this.nazwaDnia = value;
    }

}
