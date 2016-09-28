
package br.univel.produto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.univel.produto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LerProduto_QNAME = new QName("http://webservices.univel.br/", "Ler_Produto");
    private final static QName _CadastrarProduto_QNAME = new QName("http://webservices.univel.br/", "Cadastrar_Produto");
    private final static QName _LerProdutoResponse_QNAME = new QName("http://webservices.univel.br/", "Ler_ProdutoResponse");
    private final static QName _ExcluirProdutoResponse_QNAME = new QName("http://webservices.univel.br/", "Excluir_ProdutoResponse");
    private final static QName _AtualizarProduto_QNAME = new QName("http://webservices.univel.br/", "Atualizar_Produto");
    private final static QName _AtualizarProdutoResponse_QNAME = new QName("http://webservices.univel.br/", "Atualizar_ProdutoResponse");
    private final static QName _CadastrarProdutoResponse_QNAME = new QName("http://webservices.univel.br/", "Cadastrar_ProdutoResponse");
    private final static QName _ExcluirProduto_QNAME = new QName("http://webservices.univel.br/", "Excluir_Produto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.univel.produto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtualizarProdutoResponse }
     * 
     */
    public AtualizarProdutoResponse createAtualizarProdutoResponse() {
        return new AtualizarProdutoResponse();
    }

    /**
     * Create an instance of {@link CadastrarProdutoResponse }
     * 
     */
    public CadastrarProdutoResponse createCadastrarProdutoResponse() {
        return new CadastrarProdutoResponse();
    }

    /**
     * Create an instance of {@link ExcluirProduto }
     * 
     */
    public ExcluirProduto createExcluirProduto() {
        return new ExcluirProduto();
    }

    /**
     * Create an instance of {@link ExcluirProdutoResponse }
     * 
     */
    public ExcluirProdutoResponse createExcluirProdutoResponse() {
        return new ExcluirProdutoResponse();
    }

    /**
     * Create an instance of {@link AtualizarProduto }
     * 
     */
    public AtualizarProduto createAtualizarProduto() {
        return new AtualizarProduto();
    }

    /**
     * Create an instance of {@link LerProdutoResponse }
     * 
     */
    public LerProdutoResponse createLerProdutoResponse() {
        return new LerProdutoResponse();
    }

    /**
     * Create an instance of {@link LerProduto }
     * 
     */
    public LerProduto createLerProduto() {
        return new LerProduto();
    }

    /**
     * Create an instance of {@link CadastrarProduto }
     * 
     */
    public CadastrarProduto createCadastrarProduto() {
        return new CadastrarProduto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LerProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Ler_Produto")
    public JAXBElement<LerProduto> createLerProduto(LerProduto value) {
        return new JAXBElement<LerProduto>(_LerProduto_QNAME, LerProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Cadastrar_Produto")
    public JAXBElement<CadastrarProduto> createCadastrarProduto(CadastrarProduto value) {
        return new JAXBElement<CadastrarProduto>(_CadastrarProduto_QNAME, CadastrarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LerProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Ler_ProdutoResponse")
    public JAXBElement<LerProdutoResponse> createLerProdutoResponse(LerProdutoResponse value) {
        return new JAXBElement<LerProdutoResponse>(_LerProdutoResponse_QNAME, LerProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Excluir_ProdutoResponse")
    public JAXBElement<ExcluirProdutoResponse> createExcluirProdutoResponse(ExcluirProdutoResponse value) {
        return new JAXBElement<ExcluirProdutoResponse>(_ExcluirProdutoResponse_QNAME, ExcluirProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Atualizar_Produto")
    public JAXBElement<AtualizarProduto> createAtualizarProduto(AtualizarProduto value) {
        return new JAXBElement<AtualizarProduto>(_AtualizarProduto_QNAME, AtualizarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Atualizar_ProdutoResponse")
    public JAXBElement<AtualizarProdutoResponse> createAtualizarProdutoResponse(AtualizarProdutoResponse value) {
        return new JAXBElement<AtualizarProdutoResponse>(_AtualizarProdutoResponse_QNAME, AtualizarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Cadastrar_ProdutoResponse")
    public JAXBElement<CadastrarProdutoResponse> createCadastrarProdutoResponse(CadastrarProdutoResponse value) {
        return new JAXBElement<CadastrarProdutoResponse>(_CadastrarProdutoResponse_QNAME, CadastrarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.univel.br/", name = "Excluir_Produto")
    public JAXBElement<ExcluirProduto> createExcluirProduto(ExcluirProduto value) {
        return new JAXBElement<ExcluirProduto>(_ExcluirProduto_QNAME, ExcluirProduto.class, null, value);
    }

}
