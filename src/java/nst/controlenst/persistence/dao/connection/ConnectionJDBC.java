package nst.controlenst.persistence.dao.connection;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionJDBC {

    private static Connection conexao = null;

    private ConnectionJDBC() {
    }

    public static Connection getConnection() {
        if (conexao == null) {
            try {

                Class.forName("org.postgresql.Driver");
                conexao = (Connection) DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/CONTROLE_NST", "postgres", "deliciadecoco");
                //System.out.println("Conexao realizada com sucesso!");
            } catch (Exception ex) {
                System.out.println("Ocorreu o seguinte erro: " + ex);
            }
        }
        return conexao;
    }
}
