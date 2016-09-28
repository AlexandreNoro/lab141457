
package br.univel.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Atualizar_ProdutoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Atualizar_ProdutoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Produto_Atualizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Atualizar_ProdutoResponse", propOrder = {
    "produtoAtualizado"
})
public class AtualizarProdutoResponse {

    @XmlElement(name = "Produto_Atualizado")
    protected String produtoAtualizado;

    /**
     * Obtém o valor da propriedade produtoAtualizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdutoAtualizado() {
        return produtoAtualizado;
    }

    /**
     * Define o valor da propriedade produtoAtualizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdutoAtualizado(String value) {
        this.produtoAtualizado = value;
    }

}
