//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-11/28/2011 06:21 AM(foreman)- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.16 at 04:20:11 PM EDT 
//


package com.ibm.jbatch.jsl.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Listeners complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Listeners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listener" type="{http://xmlns.jcp.org/xml/ns/javaee}Listener" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Listeners", propOrder = {
    "listenerList"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-16T04:20:11-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
public class Listeners {

    @XmlElement(name = "listener")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-16T04:20:11-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected List<Listener> listenerList;

    /**
     * Gets the value of the listenerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listenerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListenerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Listener }
     * 
     * 
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2013-03-16T04:20:11-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public List<Listener> getListenerList() {
        if (listenerList == null) {
            listenerList = new ArrayList<Listener>();
        }
        return this.listenerList;
    }

}
