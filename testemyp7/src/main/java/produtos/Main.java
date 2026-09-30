package produtos;


public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema iniciado!");

        Produto produto = new Produto(
                1,
                "Produto",
                "Codigo"
        );

        ProdutoEmbalagem produtoEmbalagem = new ProdutoEmbalagem(
                1,
                1,
                "Tipo",
                "Descricao",
                "2 litros"
        );

        Banco.criarTabelas();
        Banco.insertarProduto(produto);



    } // fim de static main


}// fim de Main