/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Coordenador;
import nst.controlenst.persistence.dao.factory.interfaces.CoordenadorDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCCoordenador implements CoordenadorDAO {
    
    private static JDBCCoordenador instancia = null;
    
    private JDBCCoordenador(){
        
    }
    
    public static JDBCCoordenador getInstance(){
        if(instancia == null){
            instancia = new JDBCCoordenador();
        }
        return instancia;
    }

    @Override
    public void delete(Coordenador coordenador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Coordenador getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Coordenador coordenador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
