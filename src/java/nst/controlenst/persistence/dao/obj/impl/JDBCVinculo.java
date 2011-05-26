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
import nst.controlenst.model.entity.Vinculo;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.VinculoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCVinculo extends GenericJDBCDAO implements VinculoDAO{
    
    private static JDBCVinculo instancia = null;
    
    private static final String SQL_ADD_VINC = "INSERT INTO VINCULOS(vinc_descricao) VALUES (?)";
    private static final String SQL_UPD_VINC = "UPDATE VINCULOS SET vinc_descricao = ? WHERE vinc_id = ?";
    private static final String SQL_DEL_VINC = "DELETE FROM VINCULOS WHERE vinc_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM VINCULOS WHERE vinc_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM VINCULOS";
    
    private JDBCVinculo(){
        
    }
    
    public static JDBCVinculo getInstance(){
        if(instancia == null){
            instancia = new JDBCVinculo();
        }
        
        return instancia;
    }

    @Override
    public void delete(Vinculo vinculo) {
        try {
            executarComando(SQL_DEL_VINC, vinculo.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCVinculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<Vinculo> vinculos = null;
        try {
            ResultSet rs  = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
                vinculos = new ArrayList<Vinculo>();
                do{
                    Vinculo vinculo = (Vinculo) preencherEntidade(rs);
                    vinculos.add(vinculo);
                }while(rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCVinculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vinculos;
    }

    @Override
    public Vinculo getByPrimaryKey(Integer id) {
        Vinculo vinculo = null;
        try{
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                vinculo = (Vinculo) preencherEntidade(rs);
            }
        }catch (SQLException ex) {
            Logger.getLogger(JDBCVinculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vinculo;
    }

    @Override
    public void save(Vinculo vinculo) {
        if(vinculo.getId() == null || vinculo.getId() == 0){
            try {
                executarComando(SQL_ADD_VINC, vinculo.getDescricao());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCVinculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_VINC, vinculo.getDescricao(), vinculo.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCVinculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        Vinculo vinculo = new Vinculo();
        vinculo.setId(rs.getInt("vinc_id"));
        vinculo.setDescricao(rs.getString("vinc_descricao"));
        return  vinculo;
    }
    
}
