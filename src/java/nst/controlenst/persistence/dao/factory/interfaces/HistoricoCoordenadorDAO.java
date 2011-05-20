/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.HistoricoCoordenador;

/**
 *
 * @author pablosouza
 */
public interface HistoricoCoordenadorDAO {
    public void delete(HistoricoCoordenador historico);
    public List getAll();
    public HistoricoCoordenador getByPrimaryKey(Integer id);
    public void save(HistoricoCoordenador historico);
}
