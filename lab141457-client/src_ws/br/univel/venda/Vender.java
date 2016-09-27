
package br.univel.venda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de vender complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="vender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_Nota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vender", propOrder = {
    "numNota"
})
public class Vender {

    @XmlElement(name = "num_Nota")
    protected int numNota;

    /**
     * Obtém o valor da propriedade numNota.
     * 
     */
    public int getNumNota() {
        return numNota;
    }

    /**
     * Define o valor da propriedade numNota.
     * 
     */
    public void setNumNota(int value) {
        this.numNota = value;
    }

}
