
package br.univel.produto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Atualizar_Produto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Atualizar_Produto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdProduto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Cod_barra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preco" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Atualizar_Produto", propOrder = {
    "idProduto",
    "codBarra",
    "descricao",
    "preco"
})
public class AtualizarProduto {

    @XmlElement(name = "IdProduto")
    protected Long idProduto;
    @XmlElement(name = "Cod_barra")
    protected String codBarra;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "Preco")
    protected BigDecimal preco;

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

    /**
     * Obtém o valor da propriedade codBarra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBarra() {
        return codBarra;
    }

    /**
     * Define o valor da propriedade codBarra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBarra(String value) {
        this.codBarra = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreco(BigDecimal value) {
        this.preco = value;
    }

}
