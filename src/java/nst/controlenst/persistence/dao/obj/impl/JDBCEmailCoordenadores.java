/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.EmailCoordenador;
import nst.controlenst.persistence.dao.factory.interfaces.EmailCoordenadorDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCEmailCoordenadores implements EmailCoordenadorDAO{
    
    private static JDBCEmailCoordenadores instancia = null;
    
    private JDBCEmailCoordenadores(){
        
    }
    
    public static JDBCEmailCoordenadores getInstance(){
        if(instancia == null){
            instancia = new JDBCEmailCoordenadores();
        }
        
        return instancia;
    }

    @Override
    public void delete(EmailCoordenador email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EmailCoordenador getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(EmailCoordenador email) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
