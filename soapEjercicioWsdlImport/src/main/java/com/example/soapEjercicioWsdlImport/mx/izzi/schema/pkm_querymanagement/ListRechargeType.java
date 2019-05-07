
package com.example.soapEjercicioWsdlImport.mx.izzi.schema.pkm_querymanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listRechargeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listRechargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.izzi.mx/Schema/PKM_QueryManagement}recharge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listRechargeType", propOrder = {
    "recharge"
})
public class ListRechargeType {

    protected List<RechargeType> recharge;

    /**
     * Gets the value of the recharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RechargeType }
     * 
     * 
     */
    public List<RechargeType> getRecharge() {
        if (recharge == null) {
            recharge = new ArrayList<RechargeType>();
        }
        return this.recharge;
    }

}
