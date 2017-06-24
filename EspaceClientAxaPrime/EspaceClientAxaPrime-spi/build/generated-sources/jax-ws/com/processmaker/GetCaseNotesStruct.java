
package com.processmaker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCaseNotesStruct complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCaseNotesStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="full_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="app_uid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usr_uid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_availability" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_origin_obj" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_affected_obj1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_affected_obj2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note_recipients" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="usr_username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCaseNotesStruct", propOrder = {
    "fullName",
    "appUid",
    "usrUid",
    "noteDate",
    "noteContent",
    "noteType",
    "noteAvailability",
    "noteOriginObj",
    "noteAffectedObj1",
    "noteAffectedObj2",
    "noteRecipients",
    "usrUsername"
})
public class GetCaseNotesStruct {

    @XmlElement(name = "full_name", required = true)
    protected String fullName;
    @XmlElement(name = "app_uid", required = true)
    protected String appUid;
    @XmlElement(name = "usr_uid", required = true)
    protected String usrUid;
    @XmlElement(name = "note_date", required = true)
    protected String noteDate;
    @XmlElement(name = "note_content", required = true)
    protected String noteContent;
    @XmlElement(name = "note_type", required = true)
    protected String noteType;
    @XmlElement(name = "note_availability", required = true)
    protected String noteAvailability;
    @XmlElement(name = "note_origin_obj", required = true)
    protected String noteOriginObj;
    @XmlElement(name = "note_affected_obj1", required = true)
    protected String noteAffectedObj1;
    @XmlElement(name = "note_affected_obj2", required = true)
    protected String noteAffectedObj2;
    @XmlElement(name = "note_recipients", required = true)
    protected String noteRecipients;
    @XmlElement(name = "usr_username", required = true)
    protected String usrUsername;

    /**
     * Obtient la valeur de la propriété fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Définit la valeur de la propriété fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtient la valeur de la propriété appUid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUid() {
        return appUid;
    }

    /**
     * Définit la valeur de la propriété appUid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUid(String value) {
        this.appUid = value;
    }

    /**
     * Obtient la valeur de la propriété usrUid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrUid() {
        return usrUid;
    }

    /**
     * Définit la valeur de la propriété usrUid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrUid(String value) {
        this.usrUid = value;
    }

    /**
     * Obtient la valeur de la propriété noteDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteDate() {
        return noteDate;
    }

    /**
     * Définit la valeur de la propriété noteDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteDate(String value) {
        this.noteDate = value;
    }

    /**
     * Obtient la valeur de la propriété noteContent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteContent() {
        return noteContent;
    }

    /**
     * Définit la valeur de la propriété noteContent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteContent(String value) {
        this.noteContent = value;
    }

    /**
     * Obtient la valeur de la propriété noteType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteType() {
        return noteType;
    }

    /**
     * Définit la valeur de la propriété noteType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteType(String value) {
        this.noteType = value;
    }

    /**
     * Obtient la valeur de la propriété noteAvailability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteAvailability() {
        return noteAvailability;
    }

    /**
     * Définit la valeur de la propriété noteAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteAvailability(String value) {
        this.noteAvailability = value;
    }

    /**
     * Obtient la valeur de la propriété noteOriginObj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteOriginObj() {
        return noteOriginObj;
    }

    /**
     * Définit la valeur de la propriété noteOriginObj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteOriginObj(String value) {
        this.noteOriginObj = value;
    }

    /**
     * Obtient la valeur de la propriété noteAffectedObj1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteAffectedObj1() {
        return noteAffectedObj1;
    }

    /**
     * Définit la valeur de la propriété noteAffectedObj1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteAffectedObj1(String value) {
        this.noteAffectedObj1 = value;
    }

    /**
     * Obtient la valeur de la propriété noteAffectedObj2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteAffectedObj2() {
        return noteAffectedObj2;
    }

    /**
     * Définit la valeur de la propriété noteAffectedObj2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteAffectedObj2(String value) {
        this.noteAffectedObj2 = value;
    }

    /**
     * Obtient la valeur de la propriété noteRecipients.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteRecipients() {
        return noteRecipients;
    }

    /**
     * Définit la valeur de la propriété noteRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteRecipients(String value) {
        this.noteRecipients = value;
    }

    /**
     * Obtient la valeur de la propriété usrUsername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrUsername() {
        return usrUsername;
    }

    /**
     * Définit la valeur de la propriété usrUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrUsername(String value) {
        this.usrUsername = value;
    }

}
