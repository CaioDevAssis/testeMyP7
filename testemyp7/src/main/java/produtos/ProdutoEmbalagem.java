package produtos;

public class ProdutoEmbalagem {

    public int idProdutoEmbalagem;
    public int idProduto;
    public String tipoEmbalagem;
    public String descricaoEmbalagem;
    public String quantidade;

    public ProdutoEmbalagem(
            int idProdutoEmbalagem,
            int idProduto,
            String tipoEmbalagem,
            String descricaoEmbalagem,
            String quantidade
    ) {
        this.idProdutoEmbalagem = idProdutoEmbalagem;
        this.idProduto = idProduto;
        this.tipoEmbalagem = tipoEmbalagem;
        this.descricaoEmbalagem = descricaoEmbalagem;
        this.quantidade = quantidade;
    }

} // fim de ProdutoEmbalagem