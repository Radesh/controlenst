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
import nst.controlenst.model.entity.TipoIngresso;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TipoIngressoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCTipoIngresso extends GenericJDBCDAO implements TipoIngressoDAO {
    
    private static JDBCTipoIngresso instancia = null;
    
    private static final String SQL_ADD_TIPO = "INSERT INTO tipos_ingresso(ing_descricao) VALUES (?)";
    private static final String SQL_UPD_TIPO = "UPDATE tipos_ingresso SET ing_descricao = ? WHERE ing_id = ?";
    private static final String SQL_DEL_TIPO = "DELETE FROM tipos_ingresso WHERE ing_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM tipos_ingresso WHERE ing_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM tipos_ingresso";
    
    private JDBCTipoIngresso(){
        
    }
    
    public static JDBCTipoIngresso getInstance(){
        if(instancia == null){
            instancia = new JDBCTipoIngresso();
        }
        return instancia;
    }

    @Override
    public void delete(TipoIngresso tipoIngresso) {
        try {
            executarComando(SQL_DEL_TIPO, tipoIngresso.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTipoIngresso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<TipoIngresso> ingressos = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
                ingressos = new ArrayList<TipoIngresso>();
                do{
                    TipoIngresso tipo = (TipoIngresso) preencherEntidade(rs);
                    ingressos.add(tipo);
                }while(rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTipoIngresso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ingressos;
    }

    @Override
    public TipoIngresso getByPrimaryKey(Integer id) {
        TipoIngresso tipo = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                tipo = (TipoIngresso) preencherEntidade(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTipoIngresso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipo;
    }

    @Override
    public void save(TipoIngresso tipoIngresso) {
        if(tipoIngresso.getId() == null || tipoIngresso.getId() == 0){
            try {
                executarComando(SQL_ADD_TIPO, tipoIngresso.getDescricao());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCTipoIngresso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_TIPO, tipoIngresso.getDescricao(), tipoIngresso.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCTipoIngresso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        TipoIngresso tipo = new TipoIngresso();
        tipo.setDescricao(rs.getString("ing_descricao"));
        tipo.setId(rs.getInt("ing_id"));
        return tipo;
    }
    
}
