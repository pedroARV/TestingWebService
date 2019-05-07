
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para balanceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="balanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limitDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validtyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positiveBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balanceType", propOrder = {
    "limitDate",
    "validtyDate",
    "positiveBalance",
    "currentBalance"
})
public class BalanceType {

    @XmlElement(required = true)
    protected String limitDate;
    protected String validtyDate;
    @XmlElement(required = true)
    protected BigDecimal positiveBalance;
    @XmlElement(required = true)
    protected BigDecimal currentBalance;

    /**
     * Obtiene el valor de la propiedad limitDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitDate() {
        return limitDate;
    }

    /**
     * Define el valor de la propiedad limitDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitDate(String value) {
        this.limitDate = value;
    }

    /**
     * Obtiene el valor de la propiedad validtyDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidtyDate() {
        return validtyDate;
    }

    /**
     * Define el valor de la propiedad validtyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidtyDate(String value) {
        this.validtyDate = value;
    }

    /**
     * Obtiene el valor de la propiedad positiveBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPositiveBalance() {
        return positiveBalance;
    }

    /**
     * Define el valor de la propiedad positiveBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPositiveBalance(BigDecimal value) {
        this.positiveBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad currentBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Define el valor de la propiedad currentBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }

}
