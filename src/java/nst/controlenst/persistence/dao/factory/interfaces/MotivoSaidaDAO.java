/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.MotivoSaida;

/**
 *
 * @author pablosouza
 */
public interface MotivoSaidaDAO{
    public void delete(MotivoSaida motivoSaida);
    public List getAll();
    public MotivoSaida getByPrimaryKey(Integer id);
    public void save(MotivoSaida motivoSaida);
}
