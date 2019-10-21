//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.15 at 01:50:20 PM EDT 
//


package com.mapping.esource.fhirmapping.beans.gtp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.mapping.esource.fhirmapping.util.DateTimeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ToxicityGrade" minOccurs="0"/>
 *         &lt;element ref="{}SingleResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}TransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReportedResultStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="P"/>
 *             &lt;enumeration value="F"/>
 *             &lt;maxLength value="11"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AlertFlag">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="LP"/>
 *             &lt;enumeration value="LT"/>
 *             &lt;enumeration value="LN"/>
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="HN"/>
 *             &lt;enumeration value="HT"/>
 *             &lt;enumeration value="HP"/>
 *             &lt;enumeration value="AB"/>
 *             &lt;maxLength value="14"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DeltaFlag">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="D+"/>
 *             &lt;enumeration value="D-"/>
 *             &lt;maxLength value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ExclusionFlag">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="LX"/>
 *             &lt;enumeration value="HX"/>
 *             &lt;enumeration value="EX"/>
 *             &lt;maxLength value="12"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BlindingFlag">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="S"/>
 *             &lt;enumeration value="I"/>
 *             &lt;enumeration value="B"/>
 *             &lt;enumeration value="C"/>
 *             &lt;maxLength value="24"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ReportedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "toxicityGrade",
    "singleResult",
    "transactionType"
})
@XmlRootElement(name = "BaseResult")
public class BaseResult
    implements Serializable
{

    private final static long serialVersionUID = 5190875983846359311L;
    @XmlElement(name = "ToxicityGrade")
    protected ToxicityGrade toxicityGrade;
    @XmlElement(name = "SingleResult")
    protected List<SingleResult> singleResult;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlAttribute(name = "ReportedResultStatus")
    protected String reportedResultStatus;
    @XmlAttribute(name = "AlertFlag")
    protected String alertFlag;
    @XmlAttribute(name = "DeltaFlag")
    protected String deltaFlag;
    @XmlAttribute(name = "ExclusionFlag")
    protected String exclusionFlag;
    @XmlAttribute(name = "BlindingFlag")
    protected String blindingFlag;
    @XmlAttribute(name = "ReportedDateTime")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date reportedDateTime;

    /**
     * Gets the value of the toxicityGrade property.
     * 
     * @return
     *     possible object is
     *     {@link ToxicityGrade }
     *     
     */
    public ToxicityGrade getToxicityGrade() {
        return toxicityGrade;
    }

    /**
     * Sets the value of the toxicityGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToxicityGrade }
     *     
     */
    public void setToxicityGrade(ToxicityGrade value) {
        this.toxicityGrade = value;
    }

    /**
     * Gets the value of the singleResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the singleResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSingleResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleResult }
     * 
     * 
     */
    public List<SingleResult> getSingleResult() {
        if (singleResult == null) {
            singleResult = new ArrayList<SingleResult>();
        }
        return this.singleResult;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the reportedResultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportedResultStatus() {
        return reportedResultStatus;
    }

    /**
     * Sets the value of the reportedResultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportedResultStatus(String value) {
        this.reportedResultStatus = value;
    }

    /**
     * Gets the value of the alertFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertFlag() {
        return alertFlag;
    }

    /**
     * Sets the value of the alertFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertFlag(String value) {
        this.alertFlag = value;
    }

    /**
     * Gets the value of the deltaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltaFlag() {
        return deltaFlag;
    }

    /**
     * Sets the value of the deltaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltaFlag(String value) {
        this.deltaFlag = value;
    }

    /**
     * Gets the value of the exclusionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionFlag() {
        return exclusionFlag;
    }

    /**
     * Sets the value of the exclusionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionFlag(String value) {
        this.exclusionFlag = value;
    }

    /**
     * Gets the value of the blindingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlindingFlag() {
        return blindingFlag;
    }

    /**
     * Sets the value of the blindingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlindingFlag(String value) {
        this.blindingFlag = value;
    }

    /**
     * Gets the value of the reportedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getReportedDateTime() {
        return reportedDateTime;
    }

    /**
     * Sets the value of the reportedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportedDateTime(Date value) {
        this.reportedDateTime = value;
    }

}