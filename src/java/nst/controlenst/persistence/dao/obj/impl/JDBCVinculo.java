/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Vinculo;
import nst.controlenst.persistence.dao.factory.interfaces.VinculoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCVinculo implements VinculoDAO{
    
    private static JDBCVinculo instancia = null;
    
    private JDBCVinculo(){
        
    }
    
    public static JDBCVinculo getInstance(){
        if(instancia == null){
            instancia = new JDBCVinculo();
        }
        
        return instancia;
    }

    @Override
    public void delete(Vinculo vinculo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vinculo getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Vinculo vinculo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
