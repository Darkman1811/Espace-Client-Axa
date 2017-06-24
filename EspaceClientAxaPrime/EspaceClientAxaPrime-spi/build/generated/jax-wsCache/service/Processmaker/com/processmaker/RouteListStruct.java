
package com.processmaker;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour routeListStruct complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="routeListStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delIndex" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="delThread" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="delThreadStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeListStruct", propOrder = {
    "userId",
    "userName",
    "taskId",
    "taskName",
    "delIndex",
    "delThread",
    "delThreadStatus"
})
public class RouteListStruct {

    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String taskId;
    @XmlElement(required = true)
    protected String taskName;
    @XmlElement(required = true)
    protected BigInteger delIndex;
    @XmlElement(required = true)
    protected BigInteger delThread;
    @XmlElement(required = true)
    protected String delThreadStatus;

    /**
     * Obtient la valeur de la propriété userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Obtient la valeur de la propriété userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Définit la valeur de la propriété userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtient la valeur de la propriété taskId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Définit la valeur de la propriété taskId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Obtient la valeur de la propriété taskName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Définit la valeur de la propriété taskName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }

    /**
     * Obtient la valeur de la propriété delIndex.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDelIndex() {
        return delIndex;
    }

    /**
     * Définit la valeur de la propriété delIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDelIndex(BigInteger value) {
        this.delIndex = value;
    }

    /**
     * Obtient la valeur de la propriété delThread.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDelThread() {
        return delThread;
    }

    /**
     * Définit la valeur de la propriété delThread.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDelThread(BigInteger value) {
        this.delThread = value;
    }

    /**
     * Obtient la valeur de la propriété delThreadStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelThreadStatus() {
        return delThreadStatus;
    }

    /**
     * Définit la valeur de la propriété delThreadStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelThreadStatus(String value) {
        this.delThreadStatus = value;
    }

}
