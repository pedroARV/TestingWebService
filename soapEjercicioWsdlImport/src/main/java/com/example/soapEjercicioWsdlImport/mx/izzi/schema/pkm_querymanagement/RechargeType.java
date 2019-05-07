
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rechargeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rechargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}productName"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}initDate"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}endDate"/>
 *         &lt;element name="rechargeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechargeType", propOrder = {
    "productName",
    "initDate",
    "endDate",
    "rechargeDate"
})
public class RechargeType {

    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String initDate;
    @XmlElement(required = true)
    protected String endDate;
    @XmlElement(required = true)
    protected String rechargeDate;

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
     * Obtiene el valor de la propiedad rechargeDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeDate() {
        return rechargeDate;
    }

    /**
     * Define el valor de la propiedad rechargeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeDate(String value) {
        this.rechargeDate = value;
    }

}
