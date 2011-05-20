/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.TelefoneParticipante;

/**
 *
 * @author pablosouza
 */
public interface TelefoneParticipanteDAO {
    public void delete(TelefoneParticipante telefone);
    public List getAll();
    public TelefoneParticipante getByPrimaryKey(Integer id);
    public void save(TelefoneParticipante telefone);
}
