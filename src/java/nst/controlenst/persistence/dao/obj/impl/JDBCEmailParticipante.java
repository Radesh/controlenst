/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.EmailParticipante;
import nst.controlenst.persistence.dao.factory.interfaces.EmailParticipanteDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCEmailParticipante implements EmailParticipanteDAO{
    
    private static JDBCEmailParticipante instancia = null;
    
    
    private JDBCEmailParticipante(){
    
    }
    
    public static JDBCEmailParticipante getInstance(){
        if(instancia == null){
            instancia = new JDBCEmailParticipante();
        }
        return instancia;
    }
   

    @Override
    public void delete(EmailParticipante email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EmailParticipante getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(EmailParticipante email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
