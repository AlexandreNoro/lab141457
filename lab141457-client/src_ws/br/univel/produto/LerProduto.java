
package br.univel.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Ler_Produto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Ler_Produto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdProduto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ler_Produto", propOrder = {
    "idProduto"
})
public class LerProduto {

    @XmlElement(name = "IdProduto")
    protected Long idProduto;

    /**
     * Obtém o valor da propriedade idProduto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProduto() {
        return idProduto;
    }

    /**
     * Define o valor da propriedade idProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProduto(Long value) {
        this.idProduto = value;
    }

}
