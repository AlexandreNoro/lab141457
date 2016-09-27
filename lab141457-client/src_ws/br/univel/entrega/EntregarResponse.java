
package br.univel.entrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de entregarResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="entregarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status_Entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entregarResponse", propOrder = {
    "statusEntrega"
})
public class EntregarResponse {

    @XmlElement(name = "status_Entrega")
    protected String statusEntrega;

    /**
     * Obtém o valor da propriedade statusEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusEntrega() {
        return statusEntrega;
    }

    /**
     * Define o valor da propriedade statusEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusEntrega(String value) {
        this.statusEntrega = value;
    }

}
