/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.HistoricoCoordenador;
import nst.controlenst.persistence.dao.factory.interfaces.HistoricoCoordenadorDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCHIstoricoCoordenador implements HistoricoCoordenadorDAO{
    
    private static JDBCHIstoricoCoordenador instancia = null;
    
    private JDBCHIstoricoCoordenador(){
        
    }
    
    public static JDBCHIstoricoCoordenador getInstance(){
        if(instancia == null){
            instancia = new JDBCHIstoricoCoordenador();
        }
        return  instancia;
    }

    @Override
    public void delete(HistoricoCoordenador historico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HistoricoCoordenador getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(HistoricoCoordenador historico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
