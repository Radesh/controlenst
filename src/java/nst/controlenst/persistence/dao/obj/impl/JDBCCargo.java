/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nst.controlenst.model.entity.Cargo;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CargoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCCargo extends GenericJDBCDAO implements CargoDAO {

    private static JDBCCargo instancia = null;
    private static final String SQL_ADD_CARGO = "INSERT INTO CARGOS(CARG_DESCRICAO) VALUES (?)";
    private static final String SQL_UPD_CARGO = "UPDATE CARGOS SET CARG_DESCRICAO = ? WHERE CARG_ID = ?";
    private static final String SQL_DEL_CARGO = "DELETE FROM CARGOS WHERE CARG_ID = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM CARGOS WHERE CARG_ID= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM CARGOS";

    private JDBCCargo() {
    }

    public static JDBCCargo getInstance() {
        if (instancia == null) {
            instancia = new JDBCCargo();
        }
        return instancia;
    }

    @Override
    public void delete(Cargo cargo) {
        try {
            executarComando(SQL_DEL_CARGO, cargo.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<Cargo> cargos = new ArrayList<Cargo>();
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if (rs.next()) {
                do {
                    Cargo cargo = (Cargo) preencherEntidade(rs);
                    cargos.add(cargo);
                } while (rs.next());
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargos;
    }

    @Override
    public Cargo getByPrimaryKey(Integer id) {
        Cargo cargo = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if (rs.next()) {
                cargo = (Cargo) preencherEntidade(rs);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargo;
    }

    @Override
    public void save(Cargo cargo) {
        if(cargo.getId() == null  || cargo.getId() == 0){
            try {
                executarComando(SQL_ADD_CARGO, cargo.getDescricao());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCCargo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_CARGO, cargo.getDescricao(), cargo.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCCargo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Object preencherEntidade(ResultSet rs) throws SQLException {
        Cargo cargo = new Cargo();
        cargo.setDescricao(rs.getString("CARG_DESCRICAO"));
        cargo.setId(rs.getInt("CARG_ID"));
        return cargo;
    }
}
