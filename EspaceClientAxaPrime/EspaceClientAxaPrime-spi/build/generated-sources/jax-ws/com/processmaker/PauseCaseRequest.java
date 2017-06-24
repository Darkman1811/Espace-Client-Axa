
package com.processmaker;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="caseUid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userUid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unpauseDate" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "caseUid",
    "delIndex",
    "userUid",
    "unpauseDate"
})
@XmlRootElement(name = "pauseCaseRequest")
public class PauseCaseRequest {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String caseUid;
    @XmlElement(required = true)
    protected String delIndex;
    @XmlElement(required = true)
    protected String userUid;
    protected List<String> unpauseDate;

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
     * Obtient la valeur de la propriété caseUid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseUid() {
        return caseUid;
    }

    /**
     * Définit la valeur de la propriété caseUid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseUid(String value) {
        this.caseUid = value;
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
     * Obtient la valeur de la propriété userUid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUid() {
        return userUid;
    }

    /**
     * Définit la valeur de la propriété userUid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUid(String value) {
        this.userUid = value;
    }

    /**
     * Gets the value of the unpauseDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unpauseDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnpauseDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnpauseDate() {
        if (unpauseDate == null) {
            unpauseDate = new ArrayList<String>();
        }
        return this.unpauseDate;
    }

}
