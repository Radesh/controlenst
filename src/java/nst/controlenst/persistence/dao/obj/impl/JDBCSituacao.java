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
import nst.controlenst.model.entity.Situacao;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.SituacaoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCSituacao extends GenericJDBCDAO implements SituacaoDAO{
    
    private static JDBCSituacao instancia = null;
    
    private static final String SQL_ADD_VINC = "INSERT INTO situacoes(sit_descricao) VALUES (?)";
    private static final String SQL_UPD_VINC = "UPDATE situacoes SET sit_descricao = ? WHERE sit_id = ?";
    private static final String SQL_DEL_VINC = "DELETE FROM situacoes WHERE sit_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM situacoes WHERE sit_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM situacoes";
    
    private JDBCSituacao(){
        
    }
    
    public static JDBCSituacao getInstance(){
        if(instancia == null){
            instancia = new JDBCSituacao();
        }
        
        return instancia;
    }

    @Override
    public void delete(Situacao situacao) {
        try {
            executarComando(SQL_DEL_VINC, situacao.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSituacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<Situacao> situacoes = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
                situacoes = new ArrayList<Situacao>();
                do{
                    Situacao situacao = (Situacao) preencherEntidade(rs);
                    situacoes.add(situacao);
                }while(rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSituacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return situacoes;
    }

    @Override
    public Situacao getByPrimaryKey(Integer id) {
        Situacao situacao = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                situacao = (Situacao) preencherEntidade(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCSituacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return situacao;
    }

    @Override
    public void save(Situacao situacao) {
        if(situacao.getId() == null || situacao.getId() ==0){
            try {
                executarComando(SQL_ADD_VINC, situacao.getDescricao());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCSituacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_VINC, situacao.getDescricao(), situacao.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCSituacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        Situacao situacao = new Situacao();
        situacao.setId(rs.getInt("sit_id"));
        situacao.setDescricao(rs.getString("sit_descricao"));
        return situacao;
    }
    
}
