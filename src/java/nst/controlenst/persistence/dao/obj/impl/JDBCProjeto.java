/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Projeto;
import nst.controlenst.persistence.dao.factory.interfaces.ProjetoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCProjeto implements ProjetoDAO{
    
    private static JDBCProjeto instancia = null;
    
    private JDBCProjeto(){
        
    }
    
    public static JDBCProjeto getInstance(){
        if(instancia == null){
            instancia = new JDBCProjeto();
        }
        
        return instancia;
    }

    @Override
    public void delete(Projeto projeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Projeto getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Projeto projeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
