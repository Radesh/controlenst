/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.TipoIngresso;

/**
 *
 * @author pablosouza
 */
public interface TipoIngressoDAO {
    public void delete(TipoIngresso tipoIngresso);
    public List getAll();
    public TipoIngresso getByPrimaryKey(Integer id);
    public void save(TipoIngresso tipoIngresso);
}
