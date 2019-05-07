
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}productName"/>
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}initDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}endDate" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productsType", propOrder = {
    "productName",
    "registerDate",
    "initDate",
    "endDate",
    "status"
})
public class ProductsType {

    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String registerDate;
    protected String initDate;
    protected String endDate;
    @XmlElement(required = true)
    protected BigInteger status;

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad registerDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Define el valor de la propiedad registerDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDate(String value) {
        this.registerDate = value;
    }

    /**
     * Obtiene el valor de la propiedad initDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitDate() {
        return initDate;
    }

    /**
     * Define el valor de la propiedad initDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitDate(String value) {
        this.initDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatus(BigInteger value) {
        this.status = value;
    }

}
