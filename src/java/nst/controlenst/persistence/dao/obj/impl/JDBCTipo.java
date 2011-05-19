/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Tipo;
import nst.controlenst.persistence.dao.factory.interfaces.TipoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCTipo implements TipoDAO{
    
    private static JDBCTipo instancia = null;
    
    private JDBCTipo(){
        
    }
    
    public static JDBCTipo getInstance(){
        if(instancia == null){
            instancia = new JDBCTipo();
        }
        
        return  instancia;
    }

    @Override
    public void delete(Tipo curso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tipo getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Tipo curso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
