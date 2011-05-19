/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Cargo;

/**
 *
 * @author pablosouza
 */
public interface CargoDAO {
    public void delete(Cargo cargo);
    public List getAll();
    public Cargo getByPrimaryKey(Integer id);
    public void save(Cargo cargo);
}
