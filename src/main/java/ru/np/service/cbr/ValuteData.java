
package ru.np.service.cbr;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="ValuteCursOnDate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Vname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Vnom" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="rowOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valuteCursOnDate"
})
@XmlRootElement(name = "ValuteData", namespace = "http://web.cbr.ru/")
public class ValuteData {

    @XmlElement(name = "ValuteCursOnDate")
    protected List<ValuteData.ValuteCursOnDate> valuteCursOnDate;

    /**
     * Gets the value of the valuteCursOnDate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuteCursOnDate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuteCursOnDate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ru.np.service.cbr.ValuteData.ValuteCursOnDate }
     *
     *
     */
    public List<ValuteData.ValuteCursOnDate> getValuteCursOnDate() {
        if (valuteCursOnDate == null) {
            valuteCursOnDate = new ArrayList<ValuteData.ValuteCursOnDate>();
        }
        return this.valuteCursOnDate;
    }


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
     *         &lt;element name="Vname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Vnom" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="rowOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vname",
        "vnom",
        "vcurs",
        "vcode",
        "vchCode"
    })
    public static class ValuteCursOnDate {

        @XmlElement(name = "Vname", required = true)
        protected String vname;
        @XmlElement(name = "Vnom")
        protected short vnom;
        @XmlElement(name = "Vcurs")
        protected float vcurs;
        @XmlElement(name = "Vcode")
        protected short vcode;
        @XmlElement(name = "VchCode", required = true)
        protected String vchCode;
        @XmlAttribute(name = "id")
        @XmlSchemaType(name = "anySimpleType")
        protected String id;
        @XmlAttribute(name = "rowOrder")
        @XmlSchemaType(name = "anySimpleType")
        protected String rowOrder;

        /**
         * Gets the value of the vname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVname() {
            return vname;
        }

        /**
         * Sets the value of the vname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVname(String value) {
            this.vname = value;
        }

        /**
         * Gets the value of the vnom property.
         * 
         */
        public short getVnom() {
            return vnom;
        }

        /**
         * Sets the value of the vnom property.
         * 
         */
        public void setVnom(short value) {
            this.vnom = value;
        }

        /**
         * Gets the value of the vcurs property.
         * 
         */
        public float getVcurs() {
            return vcurs;
        }

        /**
         * Sets the value of the vcurs property.
         * 
         */
        public void setVcurs(float value) {
            this.vcurs = value;
        }

        /**
         * Gets the value of the vcode property.
         * 
         */
        public short getVcode() {
            return vcode;
        }

        /**
         * Sets the value of the vcode property.
         * 
         */
        public void setVcode(short value) {
            this.vcode = value;
        }

        /**
         * Gets the value of the vchCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVchCode() {
            return vchCode;
        }

        /**
         * Sets the value of the vchCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVchCode(String value) {
            this.vchCode = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the rowOrder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRowOrder() {
            return rowOrder;
        }

        /**
         * Sets the value of the rowOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRowOrder(String value) {
            this.rowOrder = value;
        }

    }

}
