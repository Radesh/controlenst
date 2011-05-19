/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Vinculo;

/**
 *
 * @author pablosouza
 */
public interface VinculoDAO {
    public void delete(Vinculo vinculo);
    public List getAll();
    public Vinculo getByPrimaryKey(Integer id);
    public void save(Vinculo vinculo);
}
