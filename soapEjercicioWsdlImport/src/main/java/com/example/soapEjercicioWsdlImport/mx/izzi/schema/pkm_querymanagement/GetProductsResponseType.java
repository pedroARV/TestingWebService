
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getProductsResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getProductsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}listProducts"/>
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
@XmlType(name = "getProductsResponseType", propOrder = {
    "listProducts",
    "code",
    "message"
})
public class GetProductsResponseType {

    @XmlElement(required = true)
    protected ListProductsType listProducts;
    protected int code;
    protected String message;

    /**
     * Obtiene el valor de la propiedad listProducts.
     * 
     * @return
     *     possible object is
     *     {@link ListProductsType }
     *     
     */
    public ListProductsType getListProducts() {
        return listProducts;
    }

    /**
     * Define el valor de la propiedad listProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link ListProductsType }
     *     
     */
    public void setListProducts(ListProductsType value) {
        this.listProducts = value;
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
