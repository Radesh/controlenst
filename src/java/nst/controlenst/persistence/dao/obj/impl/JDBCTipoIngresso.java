/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.TipoIngresso;
import nst.controlenst.persistence.dao.factory.interfaces.TipoIngressoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCTipoIngresso implements TipoIngressoDAO {
    
    private static JDBCTipoIngresso instancia = null;
    
    private JDBCTipoIngresso(){
        
    }
    
    public static JDBCTipoIngresso getInstance(){
        if(instancia == null){
            instancia = new JDBCTipoIngresso();
        }
        return instancia;
    }

    @Override
    public void delete(TipoIngresso tipoIngresso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TipoIngresso getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(TipoIngresso tipoIngresso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
