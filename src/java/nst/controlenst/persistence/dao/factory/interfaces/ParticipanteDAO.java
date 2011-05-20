/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Participante;

/**
 *
 * @author pablosouza
 */
public interface ParticipanteDAO {
    public void delete(Participante participante);
    public List getAll();
    public Participante getByPrimaryKey(Integer id);
    public void save(Participante participante);
}
