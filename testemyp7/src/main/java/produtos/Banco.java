package produtos;

import java.sql.Connection;
import java.sql.Statement;

public class Banco {

    public static void criarTabelas() {

        String sqlProduto = """
                CREATE TABLE IF NOT EXISTS Produto (
                    idProduto INTEGER PRIMARY KEY,
                    descricao VARCHAR(45),
                    codigoFabricante VARCHAR(45)
                )
                """;

        String sqlProdutoEmbalagem = """
                CREATE TABLE IF NOT EXISTS ProdutoEmbalagem (
                    idProdutoEmbalagem INTEGER PRIMARY KEY,
                    idProduto INTEGER,
                    tipoEmbalagem VARCHAR(45),
                    descricaoEmbalagem VARCHAR(45),
                    quantidade varchar(45),
                    FOREIGN KEY (idProduto) REFERENCES Produto(idProduto)
                )
                """;

        try (Connection conexao = Conexao.conectar();
             Statement statement = conexao.createStatement()) {

            statement.execute(sqlProduto);
            statement.execute(sqlProdutoEmbalagem);

            System.out.println("Tabelas criadas!");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }// fim de criarTabelas

    public static void insertarProduto(Produto produto) {

        String sql = "INSERT INTO Produto (idProduto, descricao, codigoFabricante) " +
                "VALUES (?, ?, ?)";

        try (
                var conexao = Conexao.conectar();
                var statement = conexao.prepareStatement(sql)
        ) {

            statement.setInt(1, produto.idProduto);
            statement.setString(2, produto.descricao);
            statement.setString(3, produto.codigoFabricante);

            statement.executeUpdate();

            System.out.println("Produto inserido com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }// fim de insertarProduto




}// fim de banco
