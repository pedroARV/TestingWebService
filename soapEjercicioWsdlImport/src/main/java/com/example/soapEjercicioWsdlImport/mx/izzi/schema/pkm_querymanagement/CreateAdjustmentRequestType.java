
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createAdjustmentRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createAdjustmentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}accountNumber"/>
 *         &lt;element name="brmId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}amount"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}reasonAdjustment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAdjustmentRequestType", propOrder = {
    "accountNumber",
    "brmId",
    "amount",
    "reasonAdjustment"
})
public class CreateAdjustmentRequestType {

    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    protected String brmId;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected String reasonAdjustment;

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad brmId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrmId() {
        return brmId;
    }

    /**
     * Define el valor de la propiedad brmId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrmId(String value) {
        this.brmId = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonAdjustment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonAdjustment() {
        return reasonAdjustment;
    }

    /**
     * Define el valor de la propiedad reasonAdjustment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonAdjustment(String value) {
        this.reasonAdjustment = value;
    }

}
