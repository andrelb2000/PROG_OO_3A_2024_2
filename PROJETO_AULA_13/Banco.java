import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class Banco {



    public Banco(){
        String url = "jdbc:sqlite:bancoAULA14.db";
        // Conectando ao banco de dados
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conectado ao SQLite.");
                // Criando uma tabela de exemplo
                String sql = "CREATE TABLE IF NOT EXISTS PESSOA (\n"
                        + " CPF TEXT PRIMARY KEY,\n"
                        + " nome TEXT NOT NULL,\n"
                        + " idade INTEGER,\n"
                        + " salario REAL\n"
                        + ");";
                
                try (Statement comando = conn.createStatement()) {
                    comando.execute(sql);
                    System.out.println("Tabela 'pessoas' criada ou já existe.");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    
    public void insereBanco(Pessoa p){
        System.out.println("Inserindo:");
        System.out.println(p.sqlINSERT());
    }
}
