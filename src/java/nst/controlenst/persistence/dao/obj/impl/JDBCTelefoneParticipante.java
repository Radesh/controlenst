/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.TelefoneParticipante;
import nst.controlenst.persistence.dao.factory.interfaces.TelefoneParticipanteDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCTelefoneParticipante implements TelefoneParticipanteDAO{
    
    private static JDBCTelefoneParticipante instancia = null;
    
    private JDBCTelefoneParticipante(){
        
    }
    
    public static JDBCTelefoneParticipante getInstance(){
        if(instancia == null){
            instancia = new JDBCTelefoneParticipante();
        }
        
        return instancia;
    }

    @Override
    public void delete(TelefoneParticipante telefone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TelefoneParticipante getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(TelefoneParticipante telefone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
