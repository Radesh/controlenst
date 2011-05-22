package nst.controlenst.persistence.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import nst.controlenst.persistence.dao.connection.ConnectionJDBC;

/**
 * 
 * @author Administrador
 */
public abstract class GenericJDBCDAO {

    public abstract Object preencherEntidade(ResultSet rs) throws SQLException;

    public Statement getStatement() throws SQLException {
        return (Statement) ConnectionJDBC.getConnection().createStatement();
    }

    public PreparedStatement getStatement(String sql) throws SQLException {
        return ConnectionJDBC.getConnection().prepareStatement(sql);
    }

    public ResultSet executarQuery(String query, Object... params)
            throws SQLException {
        PreparedStatement ps = getStatement(query);
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }

        return ps.executeQuery();
    }

    public int executarComando(String query, Object... params)
            throws SQLException {
        PreparedStatement ps = getStatement(query);

        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);

        }
        int result = ps.executeUpdate();
        ps.close();
        return result;

    }
}
