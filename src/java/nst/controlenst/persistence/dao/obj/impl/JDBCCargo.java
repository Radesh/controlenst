/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Cargo;
import nst.controlenst.persistence.dao.GenericHibernateDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CargoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCCargo implements CargoDAO{
    private static JDBCCargo instancia = null;
    
    private JDBCCargo(){
        
    }
    
    public static JDBCCargo getInstance(){
        if(instancia == null){
            instancia = new JDBCCargo();
        }
        return instancia;
    }

    @Override
    public void delete(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cargo getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
