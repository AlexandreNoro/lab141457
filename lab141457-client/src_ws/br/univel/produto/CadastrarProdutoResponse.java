
package br.univel.produto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Cadastrar_ProdutoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Cadastrar_ProdutoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status_Cad_Produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cadastrar_ProdutoResponse", propOrder = {
    "statusCadProduto"
})
public class CadastrarProdutoResponse {

    @XmlElement(name = "Status_Cad_Produto")
    protected String statusCadProduto;

    /**
     * Obtém o valor da propriedade statusCadProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCadProduto() {
        return statusCadProduto;
    }

    /**
     * Define o valor da propriedade statusCadProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCadProduto(String value) {
        this.statusCadProduto = value;
    }

}
