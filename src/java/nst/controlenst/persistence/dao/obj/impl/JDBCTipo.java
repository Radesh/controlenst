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
import nst.controlenst.model.entity.Tipo;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TipoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCTipo extends GenericJDBCDAO implements TipoDAO{
    
    private static JDBCTipo instancia = null;
    
    private static final String SQL_ADD_TIPO = "INSERT INTO TIPOS(TIP_DESCRICAO) VALUES (?)";
    private static final String SQL_UPD_TIPO = "UPDATE TIPOS SET TIP_DESCRICAO = ? WHERE TIP_ID = ?";
    private static final String SQL_DEL_TIPO = "DELETE FROM TIPOS WHERE TIP_ID = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM TIPOS WHERE TIP_ID= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM TIPOS";
    
    private JDBCTipo(){
        
    }
    
    public static JDBCTipo getInstance(){
        if(instancia == null){
            instancia = new JDBCTipo();
        }
        
        return  instancia;
    }

    @Override
    public void delete(Tipo tipo) {
        try {
            executarComando(SQL_DEL_TIPO, tipo.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<Tipo> tipos = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
                tipos = new ArrayList<Tipo>();
            do{
                Tipo tipo = (Tipo) preencherEntidade(rs);
                tipos.add(tipo);
            }while(rs.next());
        }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipos;
    }

    @Override
    public Tipo getByPrimaryKey(Integer id) {
        Tipo tipo = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                tipo = (Tipo) preencherEntidade(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipo;
    }

    @Override
    public void save(Tipo tipo) {
        if(tipo.getId() == null || tipo.getId() == 0){
            try {
                executarComando(SQL_ADD_TIPO, tipo.getDescricao());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCTipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_TIPO, tipo.getDescricao(), tipo.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCTipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        Tipo tipo = new Tipo();
        tipo.setDescricao(rs.getString("tip_descricao"));
        tipo.setId(rs.getInt("tip_id"));
        return tipo;
    }
    
}
