/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Curso;
import nst.controlenst.persistence.dao.factory.interfaces.CursoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCCurso implements CursoDAO{
    
    private static JDBCCurso instancia = null;
    
    private JDBCCurso(){
        
    }
    
    public static JDBCCurso getInstance(){
        if(instancia == null){
            instancia = new JDBCCurso();
        }
        return instancia;
    }

    @Override
    public void delete(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Curso getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
