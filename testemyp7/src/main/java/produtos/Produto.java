package produtos;

public class Produto {

    public int idProduto;
    public String descricao;
    public String codigoFabricante;

    public Produto(
            int idProduto,
            String descricao,
            String codigoFabricante) {

        this.idProduto = idProduto;
        this.descricao = descricao;
        this.codigoFabricante = codigoFabricante;
    }

} // fim de Produto