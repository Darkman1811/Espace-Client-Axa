
package com.processmaker;

import java.math.BigInteger;
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
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operatingSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webServer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serverIp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phpVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="databaseVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="databaseServerIp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="availableDatabases" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userBrowser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userIp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "timestamp",
    "version",
    "operatingSystem",
    "webServer",
    "serverName",
    "serverIp",
    "phpVersion",
    "databaseVersion",
    "databaseServerIp",
    "databaseName",
    "availableDatabases",
    "userBrowser",
    "userIp"
})
@XmlRootElement(name = "systemInformationResponse")
public class SystemInformationResponse {

    @XmlElement(name = "status_code", required = true)
    protected BigInteger statusCode;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String timestamp;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String operatingSystem;
    @XmlElement(required = true)
    protected String webServer;
    @XmlElement(required = true)
    protected String serverName;
    @XmlElement(required = true)
    protected String serverIp;
    @XmlElement(required = true)
    protected String phpVersion;
    @XmlElement(required = true)
    protected String databaseVersion;
    @XmlElement(required = true)
    protected String databaseServerIp;
    @XmlElement(required = true)
    protected String databaseName;
    @XmlElement(required = true)
    protected String availableDatabases;
    @XmlElement(required = true)
    protected String userBrowser;
    @XmlElement(required = true)
    protected String userIp;

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
     * Obtient la valeur de la propriété timestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Définit la valeur de la propriété timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtient la valeur de la propriété operatingSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Définit la valeur de la propriété operatingSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Obtient la valeur de la propriété webServer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebServer() {
        return webServer;
    }

    /**
     * Définit la valeur de la propriété webServer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebServer(String value) {
        this.webServer = value;
    }

    /**
     * Obtient la valeur de la propriété serverName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Définit la valeur de la propriété serverName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Obtient la valeur de la propriété serverIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * Définit la valeur de la propriété serverIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerIp(String value) {
        this.serverIp = value;
    }

    /**
     * Obtient la valeur de la propriété phpVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhpVersion() {
        return phpVersion;
    }

    /**
     * Définit la valeur de la propriété phpVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhpVersion(String value) {
        this.phpVersion = value;
    }

    /**
     * Obtient la valeur de la propriété databaseVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * Définit la valeur de la propriété databaseVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseVersion(String value) {
        this.databaseVersion = value;
    }

    /**
     * Obtient la valeur de la propriété databaseServerIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseServerIp() {
        return databaseServerIp;
    }

    /**
     * Définit la valeur de la propriété databaseServerIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseServerIp(String value) {
        this.databaseServerIp = value;
    }

    /**
     * Obtient la valeur de la propriété databaseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Définit la valeur de la propriété databaseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Obtient la valeur de la propriété availableDatabases.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableDatabases() {
        return availableDatabases;
    }

    /**
     * Définit la valeur de la propriété availableDatabases.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableDatabases(String value) {
        this.availableDatabases = value;
    }

    /**
     * Obtient la valeur de la propriété userBrowser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserBrowser() {
        return userBrowser;
    }

    /**
     * Définit la valeur de la propriété userBrowser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserBrowser(String value) {
        this.userBrowser = value;
    }

    /**
     * Obtient la valeur de la propriété userIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * Définit la valeur de la propriété userIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIp(String value) {
        this.userIp = value;
    }

}
