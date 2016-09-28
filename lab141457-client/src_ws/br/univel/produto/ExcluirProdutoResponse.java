
package br.univel.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Excluir_ProdutoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Excluir_ProdutoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status_Produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Excluir_ProdutoResponse", propOrder = {
    "statusProduto"
})
public class ExcluirProdutoResponse {

    @XmlElement(name = "Status_Produto")
    protected String statusProduto;

    /**
     * Obtém o valor da propriedade statusProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProduto() {
        return statusProduto;
    }

    /**
     * Define o valor da propriedade statusProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusProduto(String value) {
        this.statusProduto = value;
    }

}
