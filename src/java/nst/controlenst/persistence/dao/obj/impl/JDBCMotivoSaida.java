/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.MotivoSaida;
import nst.controlenst.persistence.dao.factory.interfaces.MotivoSaidaDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCMotivoSaida implements MotivoSaidaDAO{
    
    private static JDBCMotivoSaida instancia = null;
    
    private JDBCMotivoSaida(){
        
    }
    
    public static JDBCMotivoSaida getInstance(){
        if(instancia == null){
            instancia = new JDBCMotivoSaida();
        }
        return instancia;
    }

    @Override
    public void delete(MotivoSaida motivoSaida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public MotivoSaida getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(MotivoSaida motivoSaida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
