/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Situacao;

/**
 *
 * @author pablosouza
 */
public interface SituacaoDAO {
    public void delete(Situacao situacao);
    public List getAll();
    public Situacao getByPrimaryKey(Integer id);
    public void save(Situacao situacao);
}
