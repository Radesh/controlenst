/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import nst.controlenst.model.entity.HistoricoParticipante;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.HIstoricoParticipanteDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCHistoricoParticipantes extends GenericJDBCDAO implements HIstoricoParticipanteDAO{
    
    private static JDBCHistoricoParticipantes instancia = null;
    
    private static final String SQL_ADD_HIST = "INSERT INTO Historico_Coordenadores(histc_dt_entrada, histc_dt_saida, histc_motivo_saida, fk_coord_id, fk_proj_id) VALUES (?,?,?,?,?)";
    private static final String SQL_UPD_HIST = "UPDATE Historico_Coordenadores SET histc_dt_entrada = ?, histc_dt_saida = ?, histc_motivo_saida = ?, fk_coord_id = ?, fk_proj_id = ? WHERE histc_id = ?";
    private static final String SQL_DEL_HIST = "DELETE FROM Historico_Coordenadores WHERE histc_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM Historico_Coordenadores WHERE histc_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM Historico_Coordenadores";
    
    
    
    private JDBCHistoricoParticipantes(){
        
    }
    
    public static JDBCHistoricoParticipantes getInstance(){
        if(instancia == null){
            instancia = new JDBCHistoricoParticipantes();
        }
        return instancia;
    }

    @Override
    public void delete(HistoricoParticipante historico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HistoricoParticipante getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(HistoricoParticipante historico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        HistoricoParticipante historico = new HistoricoParticipante();
        
        historico.setId(Integer.SIZE);
        
        historico.setCargo(JDBCCargo.getInstance().getByPrimaryKey(rs.getInt("")));
        historico.setCurso(null);
        historico.setEntrada(null);
        historico.setMotivoSaida(null);
        historico.setParticipante(null);
        historico.setProjeto(null);
        historico.setSaida(null);
        historico.setTipoIngresso(null);
        historico.setVinculo(null);
        
        return historico;
    }
}
