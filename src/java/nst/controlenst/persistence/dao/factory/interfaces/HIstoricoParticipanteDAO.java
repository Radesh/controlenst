/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.HistoricoParticipante;

/**
 *
 * @author pablosouza
 */
public interface HIstoricoParticipanteDAO {
    public void delete(HistoricoParticipante historico);
    public List getAll();
    public HistoricoParticipante getByPrimaryKey(Integer id);
    public void save(HistoricoParticipante historico);
}
