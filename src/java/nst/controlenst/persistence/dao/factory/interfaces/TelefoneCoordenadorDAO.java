/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.TelefoneCoordenador;

/**
 *
 * @author pablosouza
 */
public interface TelefoneCoordenadorDAO {
    public void delete(TelefoneCoordenador telefone);
    public List getAll();
    public TelefoneCoordenador getByPrimaryKey(Integer id);
    public void save(TelefoneCoordenador telefone);
}
