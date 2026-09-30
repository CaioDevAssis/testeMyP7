package produtos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() throws SQLException {

        String url = "jdbc:sqlite:produtos.db";

        return DriverManager.getConnection(url);
    }

} // fim de Conexao