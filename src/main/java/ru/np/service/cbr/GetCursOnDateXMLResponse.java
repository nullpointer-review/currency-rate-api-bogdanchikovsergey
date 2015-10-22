package ru.np.service.cbr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetCursOnDateXMLResult">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValuteData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ValuteCursOnDate" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Vname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Vnom">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="100"/>
 *                                             &lt;enumeration value="10000"/>
 *                                             &lt;enumeration value="10"/>
 *                                             &lt;enumeration value="1000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
        "getCursOnDateXMLResult"
})
@XmlRootElement(name = "GetCursOnDateXMLResponse", namespace = "http://web.cbr.ru/")
public class GetCursOnDateXMLResponse {

    @XmlElement(name = "GetCursOnDateXMLResult", required = true, namespace = "http://web.cbr.ru/")
    protected GetCursOnDateXMLResponse.GetCursOnDateXMLResult getCursOnDateXMLResult;

    /**
     * Gets the value of the getCursOnDateXMLResult property.
     *
     * @return
     *     possible object is
     *     {@link GetCursOnDateXMLResponse.GetCursOnDateXMLResult }
     *
     */
    public GetCursOnDateXMLResponse.GetCursOnDateXMLResult getGetCursOnDateXMLResult() {
        return getCursOnDateXMLResult;
    }

    /**
     * Sets the value of the getCursOnDateXMLResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetCursOnDateXMLResponse.GetCursOnDateXMLResult }
     *
     */
    public void setGetCursOnDateXMLResult(GetCursOnDateXMLResponse.GetCursOnDateXMLResult value) {
        this.getCursOnDateXMLResult = value;
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
     *         &lt;element name="ValuteData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ValuteCursOnDate" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Vname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Vnom">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="100"/>
     *                                   &lt;enumeration value="10000"/>
     *                                   &lt;enumeration value="10"/>
     *                                   &lt;enumeration value="1000"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "valuteData"
    })
    public static class GetCursOnDateXMLResult {

        @XmlElement(name = "ValuteData", required = true)
        protected GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData valuteData;

        /**
         * Gets the value of the valuteData property.
         *
         * @return
         *     possible object is
         *     {@link GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData }
         *
         */
        public GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData getValuteData() {
            return valuteData;
        }

        /**
         * Sets the value of the valuteData property.
         *
         * @param value
         *     allowed object is
         *     {@link GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData }
         *
         */
        public void setValuteData(GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData value) {
            this.valuteData = value;
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
         *         &lt;element name="ValuteCursOnDate" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Vname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Vnom">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="100"/>
         *                         &lt;enumeration value="10000"/>
         *                         &lt;enumeration value="10"/>
         *                         &lt;enumeration value="1000"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="OnDate" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class ValuteData {

            @XmlElement(name = "ValuteCursOnDate")
            protected List<GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData.ValuteCursOnDate> valuteCursOnDate;
            @XmlAttribute(name = "OnDate")
            protected String onDate;

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
             * {@link GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData.ValuteCursOnDate }
             *
             *
             */
            public List<GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData.ValuteCursOnDate> getValuteCursOnDate() {
                if (valuteCursOnDate == null) {
                    valuteCursOnDate = new ArrayList<GetCursOnDateXMLResponse.GetCursOnDateXMLResult.ValuteData.ValuteCursOnDate>();
                }
                return this.valuteCursOnDate;
            }

            /**
             * Gets the value of the onDate property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOnDate() {
                return onDate;
            }

            /**
             * Sets the value of the onDate property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOnDate(String value) {
                this.onDate = value;
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
             *         &lt;element name="Vnom">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="100"/>
             *               &lt;enumeration value="10000"/>
             *               &lt;enumeration value="10"/>
             *               &lt;enumeration value="1000"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Vcurs" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Vcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "vname",
                    "vnom",
                    "vcurs",
                    "vcode",
                    "vchCode"
            })
            public static class ValuteCursOnDate {

                @XmlElement(name = "Vname", required = true)
                protected String vname;
                @XmlElement(name = "Vnom", required = true)
                protected String vnom;
                @XmlElement(name = "Vcurs", required = true)
                protected String vcurs;
                @XmlElement(name = "Vcode", required = true)
                protected String vcode;
                @XmlElement(name = "VchCode", required = true)
                protected String vchCode;

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
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getVnom() {
                    return vnom;
                }

                /**
                 * Sets the value of the vnom property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setVnom(String value) {
                    this.vnom = value;
                }

                /**
                 * Gets the value of the vcurs property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getVcurs() {
                    return vcurs;
                }

                /**
                 * Sets the value of the vcurs property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setVcurs(String value) {
                    this.vcurs = value;
                }

                /**
                 * Gets the value of the vcode property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getVcode() {
                    return vcode;
                }

                /**
                 * Sets the value of the vcode property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setVcode(String value) {
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

            }

        }

    }

}
