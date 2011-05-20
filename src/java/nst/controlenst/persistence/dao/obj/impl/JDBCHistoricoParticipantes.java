/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.HistoricoParticipante;
import nst.controlenst.persistence.dao.factory.interfaces.HIstoricoParticipanteDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCHistoricoParticipantes implements HIstoricoParticipanteDAO{
    
    private static JDBCHistoricoParticipantes instancia = null;
    
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
    
}
