
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPaymentReverseAdjustmentResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPaymentReverseAdjustmentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}listPayments"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}listAdjustments"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}code"/>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}message" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentReverseAdjustmentResponseType", propOrder = {
    "listPayments",
    "listAdjustments",
    "code",
    "message"
})
public class GetPaymentReverseAdjustmentResponseType {

    @XmlElement(required = true)
    protected ListPaymentType listPayments;
    @XmlElement(required = true)
    protected ListAdjustmentsType listAdjustments;
    protected int code;
    protected String message;

    /**
     * Obtiene el valor de la propiedad listPayments.
     * 
     * @return
     *     possible object is
     *     {@link ListPaymentType }
     *     
     */
    public ListPaymentType getListPayments() {
        return listPayments;
    }

    /**
     * Define el valor de la propiedad listPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPaymentType }
     *     
     */
    public void setListPayments(ListPaymentType value) {
        this.listPayments = value;
    }

    /**
     * Obtiene el valor de la propiedad listAdjustments.
     * 
     * @return
     *     possible object is
     *     {@link ListAdjustmentsType }
     *     
     */
    public ListAdjustmentsType getListAdjustments() {
        return listAdjustments;
    }

    /**
     * Define el valor de la propiedad listAdjustments.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAdjustmentsType }
     *     
     */
    public void setListAdjustments(ListAdjustmentsType value) {
        this.listAdjustments = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
