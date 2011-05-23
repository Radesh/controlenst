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
import nst.controlenst.model.entity.HistoricoCoordenador;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CoordenadorDAO;
import nst.controlenst.persistence.dao.factory.interfaces.HistoricoCoordenadorDAO;
import nst.controlenst.persistence.dao.factory.interfaces.ProjetoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCHIstoricoCoordenador extends GenericJDBCDAO implements HistoricoCoordenadorDAO{
    
    private static JDBCHIstoricoCoordenador instancia = null;
    
    private static final String SQL_ADD_HIST = "INSERT INTO Historico_Coordenadores(histc_dt_entrada, histc_dt_saida, histc_motivo_saida, fk_coord_id, fk_proj_id) VALUES (?,?,?,?,?)";
    private static final String SQL_UPD_HIST = "UPDATE Historico_Coordenadores SET histc_dt_entrada = ?, histc_dt_saida = ?, histc_motivo_saida = ?, fk_coord_id = ?, fk_proj_id = ? WHERE histc_id = ?";
    private static final String SQL_DEL_HIST = "DELETE FROM Historico_Coordenadores WHERE histc_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM Historico_Coordenadores WHERE histc_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM Historico_Coordenadores";
    
    
    private JDBCHIstoricoCoordenador(){
        
    }
    
    public static JDBCHIstoricoCoordenador getInstance(){
        if(instancia == null){
            instancia = new JDBCHIstoricoCoordenador();
        }
        return  instancia;
    }

    @Override
    public void delete(HistoricoCoordenador historico) {
        try {
            executarComando(SQL_DEL_HIST, historico.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCHIstoricoCoordenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<HistoricoCoordenador> historicos = new ArrayList<HistoricoCoordenador>();
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
                do{
                    HistoricoCoordenador histo = (HistoricoCoordenador) preencherEntidade(rs);
                    historicos.add(histo);
                }while(rs.next());
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCHIstoricoCoordenador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historicos;
    }

    @Override
    public HistoricoCoordenador getByPrimaryKey(Integer id) {
        HistoricoCoordenador historico = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                historico = (HistoricoCoordenador) preencherEntidade(rs);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCHIstoricoCoordenador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historico;
    }

    @Override
    public void save(HistoricoCoordenador historico) {
        if(historico.getId() == null || historico.getId() == 0){
            try {
                executarComando(SQL_ADD_HIST, historico.getDataEntrada(), historico.getDataSaida(), historico.getMotivoSaida(), historico.getCoordenador().getId(), historico.getProjeto().getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCHIstoricoCoordenador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_HIST, historico.getDataEntrada(), historico.getDataSaida(),
                        historico.getMotivoSaida(), historico.getCoordenador().getId(), historico.getProjeto().getId(), historico.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCHIstoricoCoordenador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        HistoricoCoordenador historicoCoordenador = new HistoricoCoordenador();
        CoordenadorDAO coordDAO = JDBCCoordenador.getInstance();
        ProjetoDAO projetoDAO = JDBCProjeto.getInstance();
        historicoCoordenador.setId(rs.getInt("histc_id"));
        historicoCoordenador.setCoordenador(coordDAO.getByPrimaryKey(rs.getInt("fk_coord_id")));
        historicoCoordenador.setDataEntrada(rs.getDate("histc_dt_entrada"));
        historicoCoordenador.setDataSaida(rs.getDate("histc_dt_saida"));
        historicoCoordenador.setMotivoSaida(rs.getString("histc_motivo_saida"));
        historicoCoordenador.setProjeto(projetoDAO.getByPrimaryKey(rs.getInt("fk_proj_id")));
        
        return historicoCoordenador;
    }
    
}
