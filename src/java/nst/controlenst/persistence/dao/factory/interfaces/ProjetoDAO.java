/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Projeto;

/**
 *
 * @author pablosouza
 */
public interface ProjetoDAO {
    public void delete(Projeto projeto);
    public List getAll();
    public Projeto getByPrimaryKey(Integer id);
    public void save(Projeto projeto);
}
