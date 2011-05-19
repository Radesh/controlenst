/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Curso;

/**
 *
 * @author pablosouza
 */
public interface CursoDAO {
    public void delete(Curso curso);
    public List getAll();
    public Curso getByPrimaryKey(Integer id);
    public void save(Curso curso);
}
