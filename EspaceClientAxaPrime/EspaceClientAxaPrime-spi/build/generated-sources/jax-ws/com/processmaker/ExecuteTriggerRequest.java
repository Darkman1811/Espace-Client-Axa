
package com.processmaker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="triggerIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "caseId",
    "triggerIndex",
    "delIndex"
})
@XmlRootElement(name = "executeTriggerRequest")
public class ExecuteTriggerRequest {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected String triggerIndex;
    protected String delIndex;

    /**
     * Obtient la valeur de la propriété sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Définit la valeur de la propriété sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obtient la valeur de la propriété caseId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Définit la valeur de la propriété caseId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    /**
     * Obtient la valeur de la propriété triggerIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerIndex() {
        return triggerIndex;
    }

    /**
     * Définit la valeur de la propriété triggerIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerIndex(String value) {
        this.triggerIndex = value;
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

}
