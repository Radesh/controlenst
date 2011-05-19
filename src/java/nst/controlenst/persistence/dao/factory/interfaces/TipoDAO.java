/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Tipo;

/**
 *
 * @author pablosouza
 */
public interface TipoDAO {
    public void delete(Tipo curso);
    public List getAll();
    public Tipo getByPrimaryKey(Integer id);
    public void save(Tipo curso);
}
