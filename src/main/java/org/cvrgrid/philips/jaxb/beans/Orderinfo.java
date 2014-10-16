//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.15 at 12:56:57 PM EDT 
//


package org.cvrgrid.philips.jaxb.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www3.medical.philips.com}ordernumber"/>
 *         &lt;element ref="{http://www3.medical.philips.com}uniqueorderid"/>
 *         &lt;element name="orderbillingcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderremarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}reasonfororder" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}drgcategories" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}orderstatus" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}inbox" minOccurs="0"/>
 *         &lt;element name="other" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="priority" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orderrequestdate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="orderrequesttime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="dateprocessed" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="timeprocessed" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ordernumber",
    "uniqueorderid",
    "orderbillingcode",
    "orderremarks",
    "reasonfororder",
    "drgcategories",
    "orderstatus",
    "inbox",
    "other"
})
@XmlRootElement(name = "orderinfo")
public class Orderinfo {

    @XmlElement(required = true)
    protected String ordernumber;
    @XmlElement(required = true)
    protected String uniqueorderid;
    protected String orderbillingcode;
    protected String orderremarks;
    protected String reasonfororder;
    protected Drgcategories drgcategories;
    protected String orderstatus;
    protected String inbox;
    protected List<Orderinfo.Other> other;
    @XmlAttribute(name = "priority", required = true)
    protected String priority;
    @XmlAttribute(name = "orderrequestdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderrequestdate;
    @XmlAttribute(name = "orderrequesttime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar orderrequesttime;
    @XmlAttribute(name = "dateprocessed")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateprocessed;
    @XmlAttribute(name = "timeprocessed")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeprocessed;

    /**
     * Gets the value of the ordernumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdernumber() {
        return ordernumber;
    }

    /**
     * Sets the value of the ordernumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdernumber(String value) {
        this.ordernumber = value;
    }

    /**
     * Gets the value of the uniqueorderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueorderid() {
        return uniqueorderid;
    }

    /**
     * Sets the value of the uniqueorderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueorderid(String value) {
        this.uniqueorderid = value;
    }

    /**
     * Gets the value of the orderbillingcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderbillingcode() {
        return orderbillingcode;
    }

    /**
     * Sets the value of the orderbillingcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderbillingcode(String value) {
        this.orderbillingcode = value;
    }

    /**
     * Gets the value of the orderremarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderremarks() {
        return orderremarks;
    }

    /**
     * Sets the value of the orderremarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderremarks(String value) {
        this.orderremarks = value;
    }

    /**
     * Gets the value of the reasonfororder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonfororder() {
        return reasonfororder;
    }

    /**
     * Sets the value of the reasonfororder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonfororder(String value) {
        this.reasonfororder = value;
    }

    /**
     * Gets the value of the drgcategories property.
     * 
     * @return
     *     possible object is
     *     {@link Drgcategories }
     *     
     */
    public Drgcategories getDrgcategories() {
        return drgcategories;
    }

    /**
     * Sets the value of the drgcategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drgcategories }
     *     
     */
    public void setDrgcategories(Drgcategories value) {
        this.drgcategories = value;
    }

    /**
     * Gets the value of the orderstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderstatus() {
        return orderstatus;
    }

    /**
     * Sets the value of the orderstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderstatus(String value) {
        this.orderstatus = value;
    }

    /**
     * Gets the value of the inbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbox() {
        return inbox;
    }

    /**
     * Sets the value of the inbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInbox(String value) {
        this.inbox = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the other property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Orderinfo.Other }
     * 
     * 
     */
    public List<Orderinfo.Other> getOther() {
        if (other == null) {
            other = new ArrayList<Orderinfo.Other>();
        }
        return this.other;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the orderrequestdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderrequestdate() {
        return orderrequestdate;
    }

    /**
     * Sets the value of the orderrequestdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderrequestdate(XMLGregorianCalendar value) {
        this.orderrequestdate = value;
    }

    /**
     * Gets the value of the orderrequesttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderrequesttime() {
        return orderrequesttime;
    }

    /**
     * Sets the value of the orderrequesttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderrequesttime(XMLGregorianCalendar value) {
        this.orderrequesttime = value;
    }

    /**
     * Gets the value of the dateprocessed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateprocessed() {
        return dateprocessed;
    }

    /**
     * Sets the value of the dateprocessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateprocessed(XMLGregorianCalendar value) {
        this.dateprocessed = value;
    }

    /**
     * Gets the value of the timeprocessed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeprocessed() {
        return timeprocessed;
    }

    /**
     * Sets the value of the timeprocessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeprocessed(XMLGregorianCalendar value) {
        this.timeprocessed = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Other {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "label", required = true)
        protected String label;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

    }

}