/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Participante;
import nst.controlenst.persistence.dao.factory.interfaces.ParticipanteDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCParticipantes implements ParticipanteDAO{
    
    private static JDBCParticipantes instancia = null;
    
    private JDBCParticipantes(){
        
    }
    
    public static JDBCParticipantes getInstance(){
        if(instancia == null){
            instancia = new JDBCParticipantes();
        }
        
        return instancia;
    }

    @Override
    public void delete(Participante participante) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Participante getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Participante participante) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
