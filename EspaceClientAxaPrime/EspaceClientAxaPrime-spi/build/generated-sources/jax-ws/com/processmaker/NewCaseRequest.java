
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
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="variables" type="{http://www.processmaker.com}variableListStruct" maxOccurs="unbounded"/&gt;
 *         &lt;element name="executeTriggers" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "processId",
    "taskId",
    "variables",
    "executeTriggers"
})
@XmlRootElement(name = "newCaseRequest")
public class NewCaseRequest {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String processId;
    @XmlElement(required = true)
    protected String taskId;
    @XmlElement(required = true)
    protected List<VariableListStruct> variables;
    protected List<BigInteger> executeTriggers;

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
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableListStruct }
     * 
     * 
     */
    public List<VariableListStruct> getVariables() {
        if (variables == null) {
            variables = new ArrayList<VariableListStruct>();
        }
        return this.variables;
    }

    /**
     * Gets the value of the executeTriggers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executeTriggers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecuteTriggers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getExecuteTriggers() {
        if (executeTriggers == null) {
            executeTriggers = new ArrayList<BigInteger>();
        }
        return this.executeTriggers;
    }

}
