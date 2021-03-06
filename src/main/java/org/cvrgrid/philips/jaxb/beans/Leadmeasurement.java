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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www3.medical.philips.com}pacepulses" minOccurs="0"/>
 *         &lt;group ref="{http://www3.medical.philips.com}leadmeasurement.elements"/>
 *       &lt;/sequence>
 *       &lt;attribute name="leadname" use="required" type="{http://www3.medical.philips.com}TYPEleadname" />
 *       &lt;attribute name="pexistflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="pmeasflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="pnotchflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="qrsexistflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="qrsspikeflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="qrsmeasflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="qrsnotchflag" type="{http://www3.medical.philips.com}TYPEnotch" />
 *       &lt;attribute name="qrsdeltaflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="stexistflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="stmeasflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="texistflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="tmeasflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="tnotchflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="atrialpaceflag" type="{http://www3.medical.philips.com}TYPEflagUnk" />
 *       &lt;attribute name="ventpaceflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pacepulses",
    "leadqualitystates",
    "pamp",
    "pdur",
    "parea",
    "ppamp",
    "ppdur",
    "ppppdur",
    "pparea",
    "pppparea",
    "qamp",
    "qdur",
    "ramp",
    "rdur",
    "samp",
    "sdur",
    "rpamp",
    "rpdur",
    "spamp",
    "spdur",
    "vat",
    "qrsppk",
    "qrsdur",
    "qrsarea",
    "ston",
    "stmid",
    "st80",
    "stend",
    "stdur",
    "stslope",
    "stshape",
    "tamp",
    "tdur",
    "tarea",
    "tpamp",
    "tptpdur",
    "tpdur",
    "tparea",
    "tptparea",
    "print",
    "prseg",
    "qtint",
    "beats",
    "namedmeasurement"
})
@XmlRootElement(name = "leadmeasurement")
public class Leadmeasurement {

    protected Pacepulses pacepulses;
    protected Leadqualitystates leadqualitystates;
    protected String pamp;
    protected String pdur;
    protected String parea;
    protected String ppamp;
    protected String ppdur;
    protected String ppppdur;
    protected String pparea;
    protected String pppparea;
    protected String qamp;
    protected String qdur;
    protected String ramp;
    protected String rdur;
    protected String samp;
    protected String sdur;
    protected String rpamp;
    protected String rpdur;
    protected String spamp;
    protected String spdur;
    protected String vat;
    protected String qrsppk;
    protected String qrsdur;
    protected String qrsarea;
    protected String ston;
    protected String stmid;
    protected String st80;
    protected String stend;
    protected String stdur;
    protected String stslope;
    protected TYPEstshape stshape;
    protected String tamp;
    protected String tdur;
    protected String tarea;
    protected String tpamp;
    protected String tptpdur;
    protected String tpdur;
    protected String tparea;
    protected String tptparea;
    protected String print;
    protected String prseg;
    protected String qtint;
    protected Beats beats;
    protected List<Namedmeasurement> namedmeasurement;
    @XmlAttribute(name = "leadname", required = true)
    protected String leadname;
    @XmlAttribute(name = "pexistflag")
    protected TYPEflag pexistflag;
    @XmlAttribute(name = "pmeasflag")
    protected TYPEflag pmeasflag;
    @XmlAttribute(name = "pnotchflag")
    protected TYPEflag pnotchflag;
    @XmlAttribute(name = "qrsexistflag")
    protected TYPEflag qrsexistflag;
    @XmlAttribute(name = "qrsspikeflag")
    protected TYPEflag qrsspikeflag;
    @XmlAttribute(name = "qrsmeasflag")
    protected TYPEflag qrsmeasflag;
    @XmlAttribute(name = "qrsnotchflag")
    protected TYPEnotch qrsnotchflag;
    @XmlAttribute(name = "qrsdeltaflag")
    protected TYPEflag qrsdeltaflag;
    @XmlAttribute(name = "stexistflag")
    protected TYPEflag stexistflag;
    @XmlAttribute(name = "stmeasflag")
    protected TYPEflag stmeasflag;
    @XmlAttribute(name = "texistflag")
    protected TYPEflag texistflag;
    @XmlAttribute(name = "tmeasflag")
    protected TYPEflag tmeasflag;
    @XmlAttribute(name = "tnotchflag")
    protected TYPEflag tnotchflag;
    @XmlAttribute(name = "atrialpaceflag")
    protected TYPEflagUnk atrialpaceflag;
    @XmlAttribute(name = "ventpaceflag")
    protected TYPEflag ventpaceflag;

    /**
     * Gets the value of the pacepulses property.
     * 
     * @return
     *     possible object is
     *     {@link Pacepulses }
     *     
     */
    public Pacepulses getPacepulses() {
        return pacepulses;
    }

    /**
     * Sets the value of the pacepulses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacepulses }
     *     
     */
    public void setPacepulses(Pacepulses value) {
        this.pacepulses = value;
    }

    /**
     * Gets the value of the leadqualitystates property.
     * 
     * @return
     *     possible object is
     *     {@link Leadqualitystates }
     *     
     */
    public Leadqualitystates getLeadqualitystates() {
        return leadqualitystates;
    }

    /**
     * Sets the value of the leadqualitystates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Leadqualitystates }
     *     
     */
    public void setLeadqualitystates(Leadqualitystates value) {
        this.leadqualitystates = value;
    }

    /**
     * Gets the value of the pamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPamp() {
        return pamp;
    }

    /**
     * Sets the value of the pamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPamp(String value) {
        this.pamp = value;
    }

    /**
     * Gets the value of the pdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdur() {
        return pdur;
    }

    /**
     * Sets the value of the pdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdur(String value) {
        this.pdur = value;
    }

    /**
     * Gets the value of the parea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParea() {
        return parea;
    }

    /**
     * Sets the value of the parea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParea(String value) {
        this.parea = value;
    }

    /**
     * Gets the value of the ppamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpamp() {
        return ppamp;
    }

    /**
     * Sets the value of the ppamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpamp(String value) {
        this.ppamp = value;
    }

    /**
     * Gets the value of the ppdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpdur() {
        return ppdur;
    }

    /**
     * Sets the value of the ppdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpdur(String value) {
        this.ppdur = value;
    }

    /**
     * Gets the value of the ppppdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpppdur() {
        return ppppdur;
    }

    /**
     * Sets the value of the ppppdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpppdur(String value) {
        this.ppppdur = value;
    }

    /**
     * Gets the value of the pparea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPparea() {
        return pparea;
    }

    /**
     * Sets the value of the pparea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPparea(String value) {
        this.pparea = value;
    }

    /**
     * Gets the value of the pppparea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPppparea() {
        return pppparea;
    }

    /**
     * Sets the value of the pppparea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPppparea(String value) {
        this.pppparea = value;
    }

    /**
     * Gets the value of the qamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQamp() {
        return qamp;
    }

    /**
     * Sets the value of the qamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQamp(String value) {
        this.qamp = value;
    }

    /**
     * Gets the value of the qdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdur() {
        return qdur;
    }

    /**
     * Sets the value of the qdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdur(String value) {
        this.qdur = value;
    }

    /**
     * Gets the value of the ramp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamp() {
        return ramp;
    }

    /**
     * Sets the value of the ramp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamp(String value) {
        this.ramp = value;
    }

    /**
     * Gets the value of the rdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdur() {
        return rdur;
    }

    /**
     * Sets the value of the rdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdur(String value) {
        this.rdur = value;
    }

    /**
     * Gets the value of the samp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamp() {
        return samp;
    }

    /**
     * Sets the value of the samp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamp(String value) {
        this.samp = value;
    }

    /**
     * Gets the value of the sdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdur() {
        return sdur;
    }

    /**
     * Sets the value of the sdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdur(String value) {
        this.sdur = value;
    }

    /**
     * Gets the value of the rpamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpamp() {
        return rpamp;
    }

    /**
     * Sets the value of the rpamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpamp(String value) {
        this.rpamp = value;
    }

    /**
     * Gets the value of the rpdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpdur() {
        return rpdur;
    }

    /**
     * Sets the value of the rpdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpdur(String value) {
        this.rpdur = value;
    }

    /**
     * Gets the value of the spamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpamp() {
        return spamp;
    }

    /**
     * Sets the value of the spamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpamp(String value) {
        this.spamp = value;
    }

    /**
     * Gets the value of the spdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpdur() {
        return spdur;
    }

    /**
     * Sets the value of the spdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpdur(String value) {
        this.spdur = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVat(String value) {
        this.vat = value;
    }

    /**
     * Gets the value of the qrsppk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsppk() {
        return qrsppk;
    }

    /**
     * Sets the value of the qrsppk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsppk(String value) {
        this.qrsppk = value;
    }

    /**
     * Gets the value of the qrsdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsdur() {
        return qrsdur;
    }

    /**
     * Sets the value of the qrsdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsdur(String value) {
        this.qrsdur = value;
    }

    /**
     * Gets the value of the qrsarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrsarea() {
        return qrsarea;
    }

    /**
     * Sets the value of the qrsarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrsarea(String value) {
        this.qrsarea = value;
    }

    /**
     * Gets the value of the ston property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSton() {
        return ston;
    }

    /**
     * Sets the value of the ston property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSton(String value) {
        this.ston = value;
    }

    /**
     * Gets the value of the stmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmid() {
        return stmid;
    }

    /**
     * Sets the value of the stmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmid(String value) {
        this.stmid = value;
    }

    /**
     * Gets the value of the st80 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt80() {
        return st80;
    }

    /**
     * Sets the value of the st80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt80(String value) {
        this.st80 = value;
    }

    /**
     * Gets the value of the stend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStend() {
        return stend;
    }

    /**
     * Sets the value of the stend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStend(String value) {
        this.stend = value;
    }

    /**
     * Gets the value of the stdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdur() {
        return stdur;
    }

    /**
     * Sets the value of the stdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdur(String value) {
        this.stdur = value;
    }

    /**
     * Gets the value of the stslope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStslope() {
        return stslope;
    }

    /**
     * Sets the value of the stslope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStslope(String value) {
        this.stslope = value;
    }

    /**
     * Gets the value of the stshape property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEstshape }
     *     
     */
    public TYPEstshape getStshape() {
        return stshape;
    }

    /**
     * Sets the value of the stshape property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEstshape }
     *     
     */
    public void setStshape(TYPEstshape value) {
        this.stshape = value;
    }

    /**
     * Gets the value of the tamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTamp() {
        return tamp;
    }

    /**
     * Sets the value of the tamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTamp(String value) {
        this.tamp = value;
    }

    /**
     * Gets the value of the tdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdur() {
        return tdur;
    }

    /**
     * Sets the value of the tdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdur(String value) {
        this.tdur = value;
    }

    /**
     * Gets the value of the tarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarea() {
        return tarea;
    }

    /**
     * Sets the value of the tarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarea(String value) {
        this.tarea = value;
    }

    /**
     * Gets the value of the tpamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpamp() {
        return tpamp;
    }

    /**
     * Sets the value of the tpamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpamp(String value) {
        this.tpamp = value;
    }

    /**
     * Gets the value of the tptpdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTptpdur() {
        return tptpdur;
    }

    /**
     * Sets the value of the tptpdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTptpdur(String value) {
        this.tptpdur = value;
    }

    /**
     * Gets the value of the tpdur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpdur() {
        return tpdur;
    }

    /**
     * Sets the value of the tpdur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpdur(String value) {
        this.tpdur = value;
    }

    /**
     * Gets the value of the tparea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTparea() {
        return tparea;
    }

    /**
     * Sets the value of the tparea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTparea(String value) {
        this.tparea = value;
    }

    /**
     * Gets the value of the tptparea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTptparea() {
        return tptparea;
    }

    /**
     * Sets the value of the tptparea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTptparea(String value) {
        this.tptparea = value;
    }

    /**
     * Gets the value of the print property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrint() {
        return print;
    }

    /**
     * Sets the value of the print property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrint(String value) {
        this.print = value;
    }

    /**
     * Gets the value of the prseg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrseg() {
        return prseg;
    }

    /**
     * Sets the value of the prseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrseg(String value) {
        this.prseg = value;
    }

    /**
     * Gets the value of the qtint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtint() {
        return qtint;
    }

    /**
     * Sets the value of the qtint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtint(String value) {
        this.qtint = value;
    }

    /**
     * Gets the value of the beats property.
     * 
     * @return
     *     possible object is
     *     {@link Beats }
     *     
     */
    public Beats getBeats() {
        return beats;
    }

    /**
     * Sets the value of the beats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beats }
     *     
     */
    public void setBeats(Beats value) {
        this.beats = value;
    }

    /**
     * Gets the value of the namedmeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedmeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedmeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Namedmeasurement }
     * 
     * 
     */
    public List<Namedmeasurement> getNamedmeasurement() {
        if (namedmeasurement == null) {
            namedmeasurement = new ArrayList<Namedmeasurement>();
        }
        return this.namedmeasurement;
    }

    /**
     * Gets the value of the leadname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadname() {
        return leadname;
    }

    /**
     * Sets the value of the leadname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadname(String value) {
        this.leadname = value;
    }

    /**
     * Gets the value of the pexistflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getPexistflag() {
        return pexistflag;
    }

    /**
     * Sets the value of the pexistflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setPexistflag(TYPEflag value) {
        this.pexistflag = value;
    }

    /**
     * Gets the value of the pmeasflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getPmeasflag() {
        return pmeasflag;
    }

    /**
     * Sets the value of the pmeasflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setPmeasflag(TYPEflag value) {
        this.pmeasflag = value;
    }

    /**
     * Gets the value of the pnotchflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getPnotchflag() {
        return pnotchflag;
    }

    /**
     * Sets the value of the pnotchflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setPnotchflag(TYPEflag value) {
        this.pnotchflag = value;
    }

    /**
     * Gets the value of the qrsexistflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getQrsexistflag() {
        return qrsexistflag;
    }

    /**
     * Sets the value of the qrsexistflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setQrsexistflag(TYPEflag value) {
        this.qrsexistflag = value;
    }

    /**
     * Gets the value of the qrsspikeflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getQrsspikeflag() {
        return qrsspikeflag;
    }

    /**
     * Sets the value of the qrsspikeflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setQrsspikeflag(TYPEflag value) {
        this.qrsspikeflag = value;
    }

    /**
     * Gets the value of the qrsmeasflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getQrsmeasflag() {
        return qrsmeasflag;
    }

    /**
     * Sets the value of the qrsmeasflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setQrsmeasflag(TYPEflag value) {
        this.qrsmeasflag = value;
    }

    /**
     * Gets the value of the qrsnotchflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEnotch }
     *     
     */
    public TYPEnotch getQrsnotchflag() {
        return qrsnotchflag;
    }

    /**
     * Sets the value of the qrsnotchflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEnotch }
     *     
     */
    public void setQrsnotchflag(TYPEnotch value) {
        this.qrsnotchflag = value;
    }

    /**
     * Gets the value of the qrsdeltaflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getQrsdeltaflag() {
        return qrsdeltaflag;
    }

    /**
     * Sets the value of the qrsdeltaflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setQrsdeltaflag(TYPEflag value) {
        this.qrsdeltaflag = value;
    }

    /**
     * Gets the value of the stexistflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getStexistflag() {
        return stexistflag;
    }

    /**
     * Sets the value of the stexistflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setStexistflag(TYPEflag value) {
        this.stexistflag = value;
    }

    /**
     * Gets the value of the stmeasflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getStmeasflag() {
        return stmeasflag;
    }

    /**
     * Sets the value of the stmeasflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setStmeasflag(TYPEflag value) {
        this.stmeasflag = value;
    }

    /**
     * Gets the value of the texistflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getTexistflag() {
        return texistflag;
    }

    /**
     * Sets the value of the texistflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setTexistflag(TYPEflag value) {
        this.texistflag = value;
    }

    /**
     * Gets the value of the tmeasflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getTmeasflag() {
        return tmeasflag;
    }

    /**
     * Sets the value of the tmeasflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setTmeasflag(TYPEflag value) {
        this.tmeasflag = value;
    }

    /**
     * Gets the value of the tnotchflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getTnotchflag() {
        return tnotchflag;
    }

    /**
     * Sets the value of the tnotchflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setTnotchflag(TYPEflag value) {
        this.tnotchflag = value;
    }

    /**
     * Gets the value of the atrialpaceflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflagUnk }
     *     
     */
    public TYPEflagUnk getAtrialpaceflag() {
        return atrialpaceflag;
    }

    /**
     * Sets the value of the atrialpaceflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflagUnk }
     *     
     */
    public void setAtrialpaceflag(TYPEflagUnk value) {
        this.atrialpaceflag = value;
    }

    /**
     * Gets the value of the ventpaceflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getVentpaceflag() {
        return ventpaceflag;
    }

    /**
     * Sets the value of the ventpaceflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setVentpaceflag(TYPEflag value) {
        this.ventpaceflag = value;
    }

}
