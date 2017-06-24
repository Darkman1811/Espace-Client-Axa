
package com.processmaker;

import java.math.BigInteger;
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
 *         &lt;element name="processUid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taskUid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userUid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendMail" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "processUid",
    "taskUid",
    "userUid",
    "note",
    "sendMail"
})
@XmlRootElement(name = "addCaseNoteRequest")
public class AddCaseNoteRequest {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String caseUid;
    @XmlElement(required = true)
    protected String processUid;
    @XmlElement(required = true)
    protected String taskUid;
    @XmlElement(required = true)
    protected String userUid;
    @XmlElement(required = true)
    protected String note;
    protected List<BigInteger> sendMail;

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
     * Obtient la valeur de la propriété processUid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessUid() {
        return processUid;
    }

    /**
     * Définit la valeur de la propriété processUid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessUid(String value) {
        this.processUid = value;
    }

    /**
     * Obtient la valeur de la propriété taskUid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskUid() {
        return taskUid;
    }

    /**
     * Définit la valeur de la propriété taskUid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskUid(String value) {
        this.taskUid = value;
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
     * Obtient la valeur de la propriété note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Définit la valeur de la propriété note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the sendMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSendMail() {
        if (sendMail == null) {
            sendMail = new ArrayList<BigInteger>();
        }
        return this.sendMail;
    }

}
