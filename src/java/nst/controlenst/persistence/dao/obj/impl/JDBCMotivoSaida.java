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
import nst.controlenst.model.entity.MotivoSaida;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.MotivoSaidaDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCMotivoSaida extends GenericJDBCDAO implements MotivoSaidaDAO{
    
    private static JDBCMotivoSaida instancia = null;
    
    private static final String SQL_ADD_VINC = "INSERT INTO motivos_saida(mot_descricao) VALUES (?)";
    private static final String SQL_UPD_VINC = "UPDATE motivos_saida SET mot_descricao = ? WHERE mot_id = ?";
    private static final String SQL_DEL_VINC = "DELETE FROM motivos_saida WHERE mot_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM motivos_saida WHERE mot_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM motivos_saida";
    
    private JDBCMotivoSaida(){
        
    }
    
    public static JDBCMotivoSaida getInstance(){
        if(instancia == null){
            instancia = new JDBCMotivoSaida();
        }
        return instancia;
    }

    @Override
    public void delete(MotivoSaida motivoSaida) {
        try {
            executarComando(SQL_DEL_VINC, motivoSaida.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMotivoSaida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<MotivoSaida> motivos = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
                motivos = new ArrayList<MotivoSaida>();
                do{
                    MotivoSaida motivo = (MotivoSaida) preencherEntidade(rs);
                    motivos.add(motivo);
                }while(rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMotivoSaida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motivos;
    }

    @Override
    public MotivoSaida getByPrimaryKey(Integer id) {
        MotivoSaida motivo = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                motivo = (MotivoSaida) preencherEntidade(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCMotivoSaida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motivo;
    }

    @Override
    public void save(MotivoSaida motivoSaida) {
        if(motivoSaida.getId() == null || motivoSaida.getId() == 0){
            try {
                executarComando(SQL_ADD_VINC, motivoSaida.getDescricao());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCMotivoSaida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_VINC, motivoSaida.getDescricao(), motivoSaida.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCMotivoSaida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        MotivoSaida motivo =new MotivoSaida();
        motivo.setId(rs.getInt("mot_id"));
        motivo.setDescricao(rs.getString("mot_descricao"));
        return motivo;
    }
    
}
