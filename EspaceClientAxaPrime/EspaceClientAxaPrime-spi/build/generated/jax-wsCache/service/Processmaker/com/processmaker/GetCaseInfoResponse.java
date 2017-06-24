
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
 *         &lt;element name="status_code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseParalell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseCreatorUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseCreatorUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentUsers" type="{http://www.processmaker.com}getCaseInfoStruct" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "statusCode",
    "message",
    "caseId",
    "caseNumber",
    "caseName",
    "caseStatus",
    "caseParalell",
    "caseCreatorUser",
    "caseCreatorUserName",
    "processId",
    "processName",
    "createDate",
    "updateDate",
    "currentUsers"
})
@XmlRootElement(name = "getCaseInfoResponse")
public class GetCaseInfoResponse {

    @XmlElement(name = "status_code", required = true)
    protected BigInteger statusCode;
    @XmlElement(required = true)
    protected String message;
    protected String caseId;
    protected String caseNumber;
    protected String caseName;
    protected String caseStatus;
    protected String caseParalell;
    protected String caseCreatorUser;
    protected String caseCreatorUserName;
    protected String processId;
    protected String processName;
    protected String createDate;
    protected String updateDate;
    protected List<GetCaseInfoStruct> currentUsers;

    /**
     * Obtient la valeur de la propriété statusCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusCode() {
        return statusCode;
    }

    /**
     * Définit la valeur de la propriété statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusCode(BigInteger value) {
        this.statusCode = value;
    }

    /**
     * Obtient la valeur de la propriété message.
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
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * Obtient la valeur de la propriété caseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Définit la valeur de la propriété caseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Obtient la valeur de la propriété caseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * Définit la valeur de la propriété caseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseName(String value) {
        this.caseName = value;
    }

    /**
     * Obtient la valeur de la propriété caseStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * Définit la valeur de la propriété caseStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatus(String value) {
        this.caseStatus = value;
    }

    /**
     * Obtient la valeur de la propriété caseParalell.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseParalell() {
        return caseParalell;
    }

    /**
     * Définit la valeur de la propriété caseParalell.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseParalell(String value) {
        this.caseParalell = value;
    }

    /**
     * Obtient la valeur de la propriété caseCreatorUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCreatorUser() {
        return caseCreatorUser;
    }

    /**
     * Définit la valeur de la propriété caseCreatorUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCreatorUser(String value) {
        this.caseCreatorUser = value;
    }

    /**
     * Obtient la valeur de la propriété caseCreatorUserName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCreatorUserName() {
        return caseCreatorUserName;
    }

    /**
     * Définit la valeur de la propriété caseCreatorUserName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCreatorUserName(String value) {
        this.caseCreatorUserName = value;
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

    /**
     * Obtient la valeur de la propriété processName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * Définit la valeur de la propriété processName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    /**
     * Obtient la valeur de la propriété createDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Définit la valeur de la propriété createDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Obtient la valeur de la propriété updateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Définit la valeur de la propriété updateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the currentUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetCaseInfoStruct }
     * 
     * 
     */
    public List<GetCaseInfoStruct> getCurrentUsers() {
        if (currentUsers == null) {
            currentUsers = new ArrayList<GetCaseInfoStruct>();
        }
        return this.currentUsers;
    }

}
