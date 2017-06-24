
package com.processmaker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour unassignedCaseListStruct complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="unassignedCaseListStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unassignedCaseListStruct", propOrder = {
    "guid",
    "name",
    "delIndex",
    "processId"
})
public class UnassignedCaseListStruct {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String delIndex;
    @XmlElement(required = true)
    protected String processId;

    /**
     * Obtient la valeur de la propriété guid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Définit la valeur de la propriété guid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété delIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelIndex() {
        return delIndex;
    }

    /**
     * Définit la valeur de la propriété delIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelIndex(String value) {
        this.delIndex = value;
    }

    /**
     * Obtient la valeur de la propriété processId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Définit la valeur de la propriété processId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

}
