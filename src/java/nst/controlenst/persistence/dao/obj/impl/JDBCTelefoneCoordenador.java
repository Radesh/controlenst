/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.TelefoneCoordenador;
import nst.controlenst.persistence.dao.factory.interfaces.TelefoneCoordenadorDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCTelefoneCoordenador implements TelefoneCoordenadorDAO {
    
    private static JDBCTelefoneCoordenador instacia = null;
    
    private JDBCTelefoneCoordenador(){
        
    }
    
    public static JDBCTelefoneCoordenador getInstance(){
        if(instacia == null){
            instacia = new JDBCTelefoneCoordenador();
        }
        
        return instacia;
    }

    @Override
    public void delete(TelefoneCoordenador telefone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TelefoneCoordenador getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(TelefoneCoordenador telefone) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
