
package br.univel.venda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de venderResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="venderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status_Venda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "venderResponse", propOrder = {
    "statusVenda"
})
public class VenderResponse {

    @XmlElement(name = "status_Venda")
    protected String statusVenda;

    /**
     * Obtém o valor da propriedade statusVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVenda() {
        return statusVenda;
    }

    /**
     * Define o valor da propriedade statusVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVenda(String value) {
        this.statusVenda = value;
    }

}
