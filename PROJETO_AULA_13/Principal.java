import java.sql.*;


public class Principal { 

    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.executar();  
        
        String url = "jdbc:sqlite:meubanco.db";

        // Conectando ao banco de dados
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conectado ao SQLite.");
                // Criando uma tabela de exemplo
                String sql = "CREATE TABLE IF NOT EXISTS pessoas (\n"
                        + " id integer PRIMARY KEY,\n"
                        + " nome text NOT NULL,\n"
                        + " idade integer\n"
                        + ");";
                
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(sql);
                    System.out.println("Tabela 'pessoas' criada ou já existe.");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }





    }
}
